def isPalindrome(num: Int) = {
	val s = num.toString
	s == s.reverse

}

val start = System.nanoTime
val palindromes = for (x <- 100 to 999; y <- x to 999 if (isPalindrome(x*y))) yield x * y
println(palindromes.max)
println((System.nanoTime - start) / 1e9)