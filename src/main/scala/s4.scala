import functions._

/* Find the largest palindrome made from the product of two 3-digit numbers. */
class s4 extends Solution {

	def solve() = {
		val palindromes = for (x <- 100 to 999; y <- x to 999 if (isPalindrome(x*y))) yield x * y
		palindromes.max.toString
	}
}