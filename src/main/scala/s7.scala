import functions._

/* What is the 10001st prime number? */
class s7 extends Solution {

	def solve() = {
		// changed from stream
		val primes = Iterator.iterate(2)(nextPrime)
		primes.drop(10000).next.toString // live dangerously
	}
}