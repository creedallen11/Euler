/* Which starting number, under one million, produces the longest Collatz sequence? */
class s14 extends Solution {

	def collatz(start: Int) = {
		def wrapper(n: Long, len: Long): Long = {
			if (n == 1) len + 1
			else if (n % 2 == 0) wrapper(n / 2, len + 1)
			else wrapper(3 * n + 1, len + 1)
		}
		wrapper(start, 0)
	}

	def solve() = {
		(1 to 1000000).par.maxBy(collatz).toString
	}
}