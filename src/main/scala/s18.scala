class s18 extends Solution {

	def solve() = {
		val source = scala.io.Source.fromFile("src/main/scala/18.txt").getLines
		val matrix = (for (line <- source) yield line.split(" ").map(_.toInt).toList).toList
		// Probably want to memoize here
		def maxDescent(i: Int, j: Int): Int = {
			if (i == matrix.length) 0
			else {
				matrix(i)(j) + (maxDescent(i + 1, j) max maxDescent(i + 1, j + 1))
			}
		}
		maxDescent(0, 0).toString
	}
}