
// Solution 1
val answer = (2520 to Int.MaxValue by 20).find(n => (11 to 20).forall(n % _ == 0)).get
println(answer)

// Solution 2
def divisibleBy(num: Int) = {
	(20 to 11 by -1).forall(num % _ == 0) // checks if num is divisible by the range 1-20
}
def factors(num: Long): List[Long] = {
	val exists = (2L to math.sqrt(num).toLong).find(num % _ == 0)
	exists match {
		case Some(d) => d :: factors(num / d)
		case None => List(num) // num is prime
	}
}
val naturalNums = Iterator.from(1)
val ans = naturalNums.find(divisibleBy).get // can ommit the (_) on divisibleBy
// find gives an option 
println(ans)


// Solution 3
def gcf(a: Long, b: Long): Long = { // don't forget to give type, it's recursive!
	if (b == 0) a
	else gcf(b, a % b)
	//factors(a).intersect(factors(b)).product
}
def lcm(a: Long, b: Long) = (a * b) / gcf(a,b)

// 1, 2, 3 lcm(lcm(1, 2), 3).... foldLeft?
// takes accumulator value, function to apply to the values
val ans3 = (1 to 20).foldLeft(1L)((a,b) => lcm(a,b))
println(ans3)

// Optimize more using Euclid's Method for GCF