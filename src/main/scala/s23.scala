import functions._

/* Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers. */
class s23 extends Solution {

	def isAbundant(n: Int) = properDivisors(n).sum > n

	def solve(): String = {
		val abundantNumbers = (1 to 28123).filter(isAbundant)
		val abundantMarkers = new Array[Boolean](28124)

		for (a <- abundantNumbers; b <- abundantNumbers 
			if (a + b) < 28123) abundantMarkers(a + b) = true

		// Filtering by array value, nice! filterNot to filter gives sum of abundants
		val answer = (0 until 28123).filterNot(abundantMarkers).sum

		answer.toString

	}
}