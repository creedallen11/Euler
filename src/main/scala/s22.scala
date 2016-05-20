import scala.io.Source

/* 
Using names.txt filecontaining over five-thousand first names, begin by sorting it into alphabetical order. 
Then working out the alphabetical value for each name, multiply this value by its alphabetical position 
in the list to obtain a name score.

What is the total of all the name scores in the file? */
class s22 extends Solution {

	val names = Source.fromFile("resources/names.txt").getLines().next().split(',').map(_.tail.init).sorted

	val A = 'A'.toInt // convience edit from forums

	def nameToNumber(name: String) = name.map(letter => letter - A + 1).sum

	def solve():String = { 
		names.zipWithIndex.map(t => (nameToNumber(t._1) * (t._2 + 1))).sum.toString
	}
}