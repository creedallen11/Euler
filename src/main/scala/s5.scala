import functions._
/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 
without any remainder.
What is the smallest positive number that is evenly divisible (divisible with no 
remainder) by all of the numbers from 1 to 20?
*/
class s5 extends Solution {

	def solve() = ((1 to 20).foldLeft(2520L)((a,b) => lcm(a,b))).toString

}