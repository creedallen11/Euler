/* From the triangle given, find the maximum total from top to bottom taking a path 
that always moves down. Ex. if you begin in row 0, your 1st move must take you into row 1. */
class s18 extends Solution {

	def solve() = {
		val source = scala.io.Source.fromFile("resources/problem_18.txt").getLines
		val matrix = (for (line <- source) yield line.split(" ").map(_.toInt).toList).toList
		
		val memoTable = collection.mutable.Map[(Int, Int), Int]()

		def maxDescent(i: Int, j: Int): Int = {
			if (i == matrix.length) 0
			else {
				memoTable.getOrElseUpdate(
					(i, j),
					matrix(i)(j) + (maxDescent(i + 1, j) max maxDescent(i + 1, j + 1)))
			}
		}
		maxDescent(0, 0).toString
	}
}