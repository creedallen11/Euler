	/* By considering the terms in the Fibonacci sequence whose values do not exceed 
	four million, find the sum of the even-valued terms. */
	class s2 extends Solution {
		def fib(x: Int, y: Int): Stream[Int] = x #:: fib(y, x + y)

		def solve():String = {
			val sol = fib(1, 2).takeWhile(n => n < 4000000)
				.foldLeft(0)((sum, n) => if (n % 2 == 0) sum + n else sum)
			return sol.toString
		}
	}