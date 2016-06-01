/* Find the sum of all products whose multiplicand/multiplier/product 
identity can be written as a 1 through 9 pandigital. */
class s32 extends Solution {
	// Works but should Scalify
	def pandigitalCheck(i: Int, j: Int, product: Int): Boolean = {
		val allDigits = i.toString.map(_.asDigit).toList ++ 
			j.toString.map(_.asDigit).toList ++
			product.toString.map(_.asDigit).toList
		if (allDigits.length != 9) return false
		for (digit <- 1 to 9) {
			if (!allDigits.contains(digit)) return false
		}
		true
	}

	def solve() = {
		var products = List[Int]()

		for (i <- 2 to 99; j <- 100 to 9999) {
			if (pandigitalCheck(i, j, i *j) && !products.contains(i*j)) {
				products = products:+(i*j)
			}
		}
		products.sum.toString
	}
}