import functions._

/* Quadratic primes: n**2 + an + b, where |a| < 1000 and |b| < 1000
Find the product of the coefficients a and b for which the epxression produces the max
number of consecutive primes starting w/ n = 0. */
class s27 extends Solution {
	
	def consecutivePrimes(n: Int, a: Int, b: Int): Int = {
		val result = (n * n) + (a * n) + b
		if (result < 0) 0
		else if (!isPrime(result)) n
		else consecutivePrimes(n + 1, a, b)
	}

	def solve() = {
		val candidates = for (a <- -999 to 999 by 2; b <- (-999 to 999 by 2).filter(isPrime)) 
			yield (consecutivePrimes(0, a, b), a, b)


		val tuple = candidates.maxBy(_._1)
		val answer = tuple._2 * tuple._3
		answer.toString
	}	
}