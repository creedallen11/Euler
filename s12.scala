// Calculate the triangular numbers
// Find the factors of the triangular numbers
// Then find the first number to have over 500 factors
def nthTriangular(n: Int) = n * (n + 1) / 2


// def triangularNumber(num: Int): Int = {
// 	if (num == 0) 0 
// 	else num + triangularNumber(num - 1)
// }
// The nth triangular can also be given by the binomial coefficient n+1 choose 2

// def factors(num: Int) = for (n <- 1 to (num/2).toInt if num % n == 0) yield n

// println(triangulars.find(l => factors(l).length >= 500).get)

// Factors returns a list of prime factors
def primeFactors(num: Long): List[Long] = {
	val exists = (2L to math.sqrt(num).toLong).find(num % _ == 0)
	exists match {
		case Some(d) => d :: primeFactors(num / d)
		case None => List(num) // num is prime
	}
}

// Find prime factorization of the numbers, add 1 to all the powers and then multiply them together
def factorsCount(num: Long): Int = {
	primeFactors(num).groupBy(identity).map(_._2.length + 1).product
}

val triangulars = Iterator.from(1).map(nthTriangular)


println(triangulars.find(factorsCount(_) >= 500).get)