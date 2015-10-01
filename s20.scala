def factorial(n: Int) = (BigInt(1) to n).product
println(factorial(200).toString.map(_.asDigit).sum)


// Solution 2
val hundo = for (i <- 1 to 200) yield BigInt(i)
println(hundo.product.toString.map(_.asDigit).sum)


// Solution 3
