//(2 to 5).combinations(2).map(n => ((n(0), n(1)), (n(1), n(0)))).foreach(println)

val all = for (a <- 2 to 100; b <- 2 to 100) yield BigInt(a).pow(b)
println(all.distinct.size)


