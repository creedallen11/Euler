import functions._

/* How many routes from 0,0 in a 20x20 grid to 19, 19 making only right/down moves? */
class s15 extends Solution {

	def solve() = {
		nChooseR(40, 20).toString
	}
}