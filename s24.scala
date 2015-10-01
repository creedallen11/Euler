println("0123456789".permutations.drop(999999).next)

// def nthPermutation(n: Int, digits: Seq[Int]): Seq[Int] = {
// 	if (digits.length == 1) {
// 		digits
// 	} else {
// 		val smallerPermutations = ((digits.length - 1!)).toInt
// 		val groupIndex = n / smallerPermutations
// 		val withinGroup = n % smallerPermutations
// 		digits(groupIndex) +: nthPermutation(withinGroup, digits.filterNot(_ == digits(groupIndex)))

// 	}
// }


// println(nthPermutation(999999, 0 to 9).mkString)