import functions._

/* What is the largest prime factor of the number 600851475143? */
class s3 extends Solution {
	def solve() = prime_factorization(600851475143L).last.toString
}