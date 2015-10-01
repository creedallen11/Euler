def depthSum(n: Int) = {
	if (n == 1) List(1)
	else (for (d <- 0 to 3 * (n - 1) by n - 1) yield (n*n - d)).toList
}

val partials = for (x <- 1001 to 1 by -2) yield depthSum(x).sum

println(partials.sum)