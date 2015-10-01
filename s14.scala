// Which Collatz sequence starting under 1 million produces the longest chain?
// n -> n / 2 (n is even) and n -> 3n + 1 (n is odd)
// NOTE: Once the chain starts the terms are allowed to go above one million.


def collatzSequence(start: Long) = {
	//if (n == 1) List(n) // Assumes all Collatz Sequences terminate at 1 (not yet proven)
	def loop(n: Long, lengthSoFar: Long): Long = {
		if (n == 1) lengthSoFar + 1
		else if (n % 2 == 0) loop(n/2, lengthSoFar+1)
		else loop(3*n+1, lengthSoFar+1)

	}
	//else  if (n % 2 == 0) n::collatzSequence(n / 2) else n::collatzSequence(3*n + 1)
	loop(start, 0)
}

val answer = (1L to 1000000).par.maxBy(collatzSequence)
println(answer)