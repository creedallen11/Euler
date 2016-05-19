import functions._

/* Find the sum of the digits in the number 100! */
class s20 extends Solution {

	def solve() = {
		factorial(100).toString.map(_.asDigit).sum.toString
	}
}