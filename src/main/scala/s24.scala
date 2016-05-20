/* What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9? */
class s24 extends Solution {
	//TODO Solve using tail recursion. 
	def solve() = {
		"0123456789".permutations.drop(999999).next.toString
	}
}