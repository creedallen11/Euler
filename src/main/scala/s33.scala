class s33 extends Solution {

	def solve() =  {
		val candidates = for (a <- 1 to 9; b <- 1 to 9; c <- 1 to 9) yield {
			List(
				new Rational(a * 10 + c, b * 10 + c),
				new Rational(c * 10 + a, b * 10 + c),
				new Rational(a * 10 + c, c * 10 + b),
				new Rational(c * 10 + a, c * 10 + b)
			).filter(_ equals new Rational(a, b)) 
		}
		candidates.flatten.filter(f => f.numer < f.denom).reduce(_ * _).denom.toString
	}
}