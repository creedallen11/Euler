/* What is the sum of the diagonals of an outward counter clockwise spiral starting at 1 
in a 1001 x 1001 spiral? */
class s28 extends Solution {
	
	def depthSum(n: Int) = {
		if (n == 1) List(1) // formula found using examplify technique on paper
		else (for (d <- 0 to 3 * (n - 1) by n - 1) yield (n*n - d)).toList
	}

	def solve() = {
		val partials = for (x <- 1001 to 1 by -2) yield depthSum(x).sum
		partials.sum.toString
	}
}