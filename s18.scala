import scala.io.Source

val source = Source.fromFile("s18.txt").getLines // string iterator 
val matrix = (for (line <- source) yield line.split(" ").map(_.toInt).toList).toList

def maxValue(i: Int, j: Int): Int = {
	if (i == matrix.length) 0
	else matrix(i)(j) + (maxValue(i + 1, j) max maxValue(i + 1, j + 1))
}


println(maxValue(0, 0))