object functions {
	//TODO: Implement Generics
	def factorial(n: Int) = (BigInt(1) to n).product

	def gcf(a: Long, b: Long): Long = if (b == 0) a else gcf(b, a % b)

	def isPalindrome(n: Int) = n.toString == n.toString.reverse

	def isPrime(n: Int) = !(2 to math.sqrt(n).toInt).exists(n % _ == 0)
	def isPrime(l: Long) = !(2L to math.sqrt(l).toLong).exists(l % _ == 0)

	// def isPrime[A: Numeric](n: A)(implicit num: Numeric[A]) = {
	// 	import num._
	// 	!(2 to math.sqrt(n).toInt).exists(n % _ == 0)
		// generic not working
	// }

	def lcm(a: Long, b: Long) = (a * b) / gcf(a, b)

	def nChooseR(n: Int, r: Int) = factorial(n) / (factorial(r) * factorial(n-r))

	def nextPrime(n: Int) = Iterator.from(n + 1).find(isPrime(_)).get

	def prime_factorization(n: Long): List[Long] = {
		val exists = (2L to math.sqrt(n).toLong).find(n % _ == 0)
		exists match {
			// Add prime to list and recur on n factoring out the prime.
			case Some(prime) => prime :: prime_factorization(n / prime)
			case None => List(n) // n is prime. 
		}
	}

}