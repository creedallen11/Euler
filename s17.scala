val words:Map[Int, String] = Map( 0 -> "",
	1 -> "one", 2 -> "two", 3 -> "three", 4 -> "four", 5 -> "five",
	6 -> "six", 7 -> "seven", 8 -> "eight", 9 -> "nine", 10 -> "ten",
	11 -> "eleven", 12 -> "twelve", 13 -> "thirteen", 14 -> "fourteen",
	15 -> "fifteen", 16 -> "sixteen", 17 -> "seventeen", 18 -> "eighteen",
	19 -> "nineteen", 20 -> "twenty", 30 -> "thirty", 40 -> "forty", 
	50 -> "fifty", 60 -> "sixty", 70 -> "seventy", 80 -> "eighty",
	90 -> "ninety")

def oneDigit(n: Int, words: Map[Int, String]) = words(n)

def twoDigit(n: Int, words: Map[Int, String]) = {
	if (n < 20) words(n)
	else {
	val single = n % 10
	if (single == 0) words(n) else words(n-single)+words(single)
	}
}

def threeDigit(n: Int, words: Map[Int, String]):String = {
	if (n < 100) twoDigit(n, words)
	else {
	if (n % 100 == 0) words(n/100) + "hundred"
	else words(n/100) + "hundredand" + twoDigit(n % 100, words)
	}
}

//yield threeDigit(num, words)
val w = for (num <- 1 to 999) yield threeDigit(num, words)
println(w.flatten.length + "onethousand".length)

// println(threeDigit(115, words) + threeDigit(115, words).length)
// println(threeDigit(342, words) + threeDigit(342, words).length)