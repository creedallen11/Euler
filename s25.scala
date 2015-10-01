val fib: Stream[BigInt] = BigInt(1)#::BigInt(1)#:: fib.zip(fib.tail).map(n => n._1 + n._2)
// Answer index is ordinal so add 1 to result
val answer = fib.indexWhere(_.toString.length == 1000) + 1

println(answer)

val φ = (1 + Math.sqrt(5)) / 2

val ans = Math.ceil((999 + Math.log10(5)/2) / Math.log10(φ))

println(ans)