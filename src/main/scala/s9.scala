import functions._
/*There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc. */
class s9 extends Solution {

	def isValidTriplet(a: Int, b: Int, c: Int, target: Int) = {
		a*a + b*b == c*c && a + b + c == target
	}

	def getTriplet(sum: Int) = {
		val triplet = for (a <- (1 to sum).view; // makes these lazy collections 
		b <- a to sum; 
		c <- b to sum if (isValidTriplet(a, b, c, sum))) yield (a, b, c)
		triplet.head
	}

	def solve = {
		val triplet = getTriplet(1000)
		(triplet._1 * triplet._2 * triplet._3).toString
	}
}