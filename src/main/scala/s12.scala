import functions._
/* What is the value of the first triangle number to have over five hundred divisors? */
class s12 extends Solution {

	def trianglify(n: Int) = n * (n + 1) / 2

	def countFactors(n: Long): Long = {
		val ans = prime_factorization(n).groupBy(identity).map(_._2.length + 1).product
		ans
	}

	def solve() = {
		val triangleSeries = Iterator.from(1).map(trianglify)
		val target = triangleSeries.find(countFactors(_) >= 500).get
		target.toString
	}

}