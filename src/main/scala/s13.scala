class s13 extends Solution {

	def solve() = {
		val source = scala.io.Source.fromFile("resources/problem_13.txt")
		val lines = try source.mkString finally source.close()
		val numbers = lines.split("\n").map(BigInt(_))  
		val answer = numbers.sum
		answer.toString.take(10)
	}
}