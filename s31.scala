/** 
In England the currency is made up of pound, £, and pence, p, and there are eight coins in general circulation:
1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
It is possible to make £2 in the following way:
1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p
How many different ways can £2 be made using any number of coins?
*/
// Dynamic Solution
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
