// Find the prime factors of 1000
// Find all ways to distribute them amongst a, b, c
// Check those combinatinos for a < b < c and a2 b2 = c2

def isValidTriplet(a: Int, b: Int, c: Int, sum: Int) = {
	a*a + b*b == c*c && a + b + c == sum //&& a < b && b < c
}

def tripletForSum(sum: Int) = {
	val triplet = for (a <- (1 to sum).view; // makes these lazy collections
	b <- a to sum; 
	c <- b to sum if (isValidTriplet(a, b, c, sum))) yield (a, b, c)
	triplet.head
}

val answerTriplet = tripletForSum(1000)
println(answerTriplet)
val answer = answerTriplet._1 * answerTriplet._2 * answerTriplet._3
println(answer)
