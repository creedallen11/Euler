/* Find the sum of all the numbers that can be written as the sum of fifth powers of their digits. */
class s30 extends Solution {

	val digitPowers = (0 to 9).map(n => Math.pow(n, 5).toInt)

	def fifthPowersSum(n: Int) = n.toString.map(_.asDigit).toList.map(digitPowers(_).toInt).sum == n

	def solve() = {
		// 354294 is the max for 5th power sum done by hand
		val ans = Iterator.from(2).takeWhile(_ < 354294).filter(fifthPowersSum).sum
		ans.toString
	}
}