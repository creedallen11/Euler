// Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.

def properDivisors(n: Int) = (1 to n/2).filter(i => n % i == 0)

def isAbundant(n: Int) = properDivisors(n).sum > n

val abundantNumbers = (1 to 28123).filter(isAbundant)
val abundantMarkers = new Array[Boolean](28124)

// Update marker array true = # can be written as sum of 2 abundants
for (a <- abundantNumbers; b <- abundantNumbers if (a + b) < 28123) abundantMarkers(a + b) = true


val answer = (0 until 28123).filterNot(abundantMarkers).sum
println(answer)


// Create an array of bools in which true is abundant.
// val abundants = Array.tabulate(28213)(n => 
// 	if (properDivisors(n).sum > n) true else false)