// def primes: Stream[Int] = 2 #:: Stream.from(3).
//   filter(i => primes.takeWhile(k => k * k <= i).forall(k => i % k > 0))
// println(primes(10000))

// Solution 2
// 1 check if number is primes
// find out the next prime number
// create infinite series of primes
def isPrime(num: Int) = !(2 to math.sqrt(num).toInt).exists(num % _ == 0)


def nextPrime(num: Int) = Iterator.from(num + 1).find(isPrime).get // dont need to underscore/paren isPrime, returns an option

// Iterators dont store all the numbers, streams do.
val primes = Iterator.iterate(2)(nextPrime)
println(primes.drop(10000).next) 