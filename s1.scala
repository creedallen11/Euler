
//Find the sum of all the multiples of 3 or 5 below 1000.

var result = 0
for (i <- Range(1,1000)) 
	if (i % 3 == 0 || i % 5 == 0) result += i
println(result)


val x = (1 until 1000).foldLeft(0)((s, n) => if ((n % 3 == 0) || (n % 5 == 0)) s + n else s)
println(x)

println((1 until 1000).filter(n => n % 3 == 0 || n % 5 == 0).sum)