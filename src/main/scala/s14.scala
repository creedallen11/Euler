/* Which starting number, under one million, produces the longest Collatz sequence? */
class s14 extends Solution {

	def collatz(start: Int) = {
		/* Recursive def of collatz sequence length. */
		def wrapper(n: Long, len: Long): Long = {
			if (n == 1) len + 1
			else if (n % 2 == 0) wrapper(n / 2, len + 1) 
			else wrapper(3 * n + 1, len + 1)
		}
		wrapper(start, 0)
	}

	def solve() = {
		/* Added some useful Scala functions:
		- par will solve each concurrently. Converts "normal" collection to
		parallel collection. 
		val v = (0 to 10)
		v.foreach(print); v.par.foreach(print); v.par.foreach { e => print(e); Thread.sleep(100) }
		- maxBy will find the max by the function passed (Collatz here) */
		(1 to 1000000).par.maxBy(collatz).toString
	}
}