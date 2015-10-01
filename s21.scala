def properDivisors(n: Int) = (1 to n/2).filter(i => n % i == 0)

def d(n: Int) = properDivisors(n).sum

def isAmicable(x: Int, y: Int) = d(x) == y && d(y) == x && x != y


val answer = (for (n <- 220 to 10000 by 2 if isAmicable(n, d(n))) yield n).sum
println(answer)
// val f = (220 to 10000 by 2).foldLeft(0)((s, n) => if (isAmicable(n, d(n))) s + n else s)
// println(f)



// def sumProperDivisor(n: Int): Int = (1 to n / 2).
//   foldLeft(0)((acc, d) => if (n % d == 0) acc + d else acc)
// (2 to 10000).filter(n=> (n == sumProperDivisor(sumProperDivisor(n)))
//   && (sumProperDivisor(n) != n)).sum


// In theory slightly faster proper divisors
// def properDivs(num: Int): Seq[Int] = {
// 	if (num == 0) Seq()
// 	else 1 +: (2 to Math.sqrt(num).toInt).flatMap { n=> 
// 		if (num % n == 0) {
// 			val brother = num / n
// 			if (brother == n) {
// 				Seq(n)
// 			} else {
// 				Seq(n, brother)
// 			}
// 		} else Seq()		
// 			}
// }