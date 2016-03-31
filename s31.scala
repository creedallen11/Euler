// DP Solution
def dp_currency_combos(total: Int, denominations: List[Int]): Int = {
	val table = Array.ofDim[Int](total + 1)
	table(0) = 1 // 1 way to make a total of 0
	for (i <- 0 until denominations.length;
		j <- denominations(i) to total) {
		table(j) += table(j - denominations(i))
	} 
	table(total)
}
val denominations = List(1, 2, 5, 10, 20, 50, 100, 200)
println(dp_currency_combos(200, denominations))
