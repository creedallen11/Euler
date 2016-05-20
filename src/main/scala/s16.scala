/* What is the sum of the digits of the number 2**1000? */
class s16 extends Solution {

	def solve() = {
		// Bit shift solution
		(BigInt(2) << (999)).toString.map(_.asDigit).sum.toString
	}
}