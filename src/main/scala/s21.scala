import functions._

/* Evaluate the sum of all the amicable numbers under 10000. */
class s21 extends Solution {

	def isAmicable(x: Long) = {
		val y = properDivisors(x).sum
		x == properDivisors(y).sum && x != y
	}

	def solve() = {
		(1L until 10000).filter(isAmicable).sum.toString
	}
}