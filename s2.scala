// Use a stream when dealing with a serious with unknown end. 
// If we didnt need the values we could use an iterator. 
def fib(x: Int, y: Int): Stream[Int] = x #:: fib(y, x + y)


val start1 = System.nanoTime
val ans = fib(1, 2).takeWhile(n => n <= 4000000).filter(n => n % 2 == 0).sum
println(ans)
println(System.nanoTime - start1)

val start2 = System.nanoTime
val ans2 = fib(1, 2).takeWhile(n => n <= 4000000).foldLeft(0)((s, n) => if (n % 2 == 0) s + n else s)
println(ans2)
println(System.nanoTime - start2)

