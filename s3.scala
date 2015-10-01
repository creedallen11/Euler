// val start1 = System.nanoTime

// val N = 600851475143L
// val primes: Stream[Int] = 2 #:: Stream.from(3).filter(i => primes.takeWhile(k=> k * k < i).forall(k => i % k > 0))
// println(primes.takeWhile(_ <= math.sqrt(N).toInt).filter(p => N % p == 0).last)
// println(System.nanoTime - start1)


// 132 = 2 * 66 
// 66 = 2 * 33
// 33 = 3 * 11
// 11 = prime

//factors(132) = 2, 3, 3, 11

// finds the prime factorization
def factors(num: Long): List[Long] = {
	val exists = (2L to math.sqrt(num).toLong).find(num % _ == 0)
	exists match {
		case Some(d) => d :: factors(num / d)
		case None => List(num) // num is prime
	}
}

val start = System.nanoTime
println(factors(600851475143L).max)
println(System.nanoTime - start)