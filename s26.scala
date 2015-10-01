import scala.annotation.tailrec

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

println((1 until 1000).maxBy(cycleLength))


val res = (1 to 999).map(
  x => (x, (1 to x).find(y => (BigInt(10).pow(y)-BigInt(1)).mod(BigInt(x)) == BigInt(0))))
  .maxBy(_._2)._1
println(res)