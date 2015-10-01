// parse the input file into a list of strings
// merge sort that list
// pair each element in the list with its heuristic value
// return the sum of the heuristic values (probably dont need BigInt)
import scala.io.Source

val names = Source.fromFile("names.txt").getLines().next().split(',').map(_.tail.init).sorted

val A = 'A'.toInt

def nameNumber(name: String) = {
	name.map(l => l - A + 1).sum
}
//println(names.mkString("\n"))

println(names.zipWithIndex.map(t => (nameNumber(t._1) * (t._2 + 1))).sum)