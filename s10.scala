
// from s7, changed to long
def isPrime(num: Long) = !(2L to math.sqrt(num).toInt).exists(num % _ == 0)
val answer = 2 + (3L to 2000000 by 2).filter(isPrime).sum
println(answer)
//val primes = 2#::Stream.from(3).filter(isPrime)

//primes.takeWhile(n => n < 2000000).print

// val primes = Iterator.iterate(2)(nextPrime)
// primes.takeWhile()
//primes.take(100).print
// 1179908154
// 1709600813
// 2147483647 = MAX INT