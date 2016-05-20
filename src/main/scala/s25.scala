/* What is the index of the first term in the Fibonacci sequence to contain 1000 digits? 1, 1, 2... */
class s25 extends Solution {

	val fib: Stream[BigInt] = BigInt(1)#::BigInt(1)#:: fib.zip(fib.tail).map(n => n._1 + n._2)

	// Could also solve using Binet's formula	
	def solve() = {
		val answer = fib.indexWhere(_.toString.length == 1000) + 1
		answer.toString
	}
}