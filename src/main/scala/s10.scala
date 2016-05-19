import functions._
/* Find the sum of all the primes below two million. */
class s10 extends Solution {
	
	def solve() = {
		(2 + (3L to 2000000 by 2).filter(isPrime).sum).toString
	}
}