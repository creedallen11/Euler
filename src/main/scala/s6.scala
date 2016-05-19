/* Find the difference between the sum of squares and the square of sums
of the first 100 natural numbers. */

class s6 extends Solution {
	def solve() = {
		val difference = Math.pow((1 to 100).sum, 2) - (1 to 100).map(n => n * n).sum
		f"$difference%1.0f"
	}
}