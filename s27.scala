// From old euler problem
def isPrime(num: Int) = !(2 to math.sqrt(num).toInt).exists(num % _ == 0)

def consecutivePrimes(n: Int, a: Int, b: Int): Int = {
	val result = (n * n) + (a * n) + b
	if (result < 0) 0 
	else if (!isPrime(result)) n
	else consecutivePrimes(n+1, a, b)
}


// Since n starts at 0, b must be a prime. 
// We could check a = -999 until 1000; b = primes < 1000
// a has to be odd, so we can further eliminate to -999 until 1000 by 2
// (because 1**2 + a*1 + b) = 1 + a + odd and if a is odd the sum on n = 1 is even.

val candidates = for (a <- -999 to 999 by 2; b <- (-999 to 999 by 2).filter(isPrime)) 
yield (consecutivePrimes(0, a, b), a, b)


val tuple = candidates.maxBy(_._1)
val answer = tuple._2 * tuple._3