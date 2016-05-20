import scala.annotation.tailrec

/* Find the value of d < 1000 for which 1/d contains the longest recurring cycle 
in its decimal fraction part. */
class s26 extends Solution {

	// Below solution (not mine) is very functional. Try and solve future problems in similar way.
	// def solve() = (1 until 1000).maxBy(cycleLength).toString
	def cycleLength(denom: Int) = {
		@tailrec
		def helper(remainders: Seq[Int], current: Int): Int = {
			if (remainders.contains(current)) {
				remainders.size - remainders.indexOf(current)
			} else {
				helper(remainders :+ current, (current * 10) % denom)
			}
		}
		helper(Seq(), 1)
	}

	def solve() = {
		val res = (1 to 999).map(
  			x => (x, (1 to x).find(y => (BigInt(10).pow(y)-BigInt(1)).mod(BigInt(x)) == BigInt(0))))
  			.maxBy(_._2)._1
		res.toString
	}

}