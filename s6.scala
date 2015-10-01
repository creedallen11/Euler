println(Math.pow((1 to 100).sum, 2) - (1 to 100).map(n => n * n).sum)


// Solution 2
val sumSquares = (1 to 100).foldLeft(0)((a, b) => a + b*b)
val sum = (1 to 100).sum
val squareSum = sum * sum
val answer = squareSum - sumSquares
println(answer)