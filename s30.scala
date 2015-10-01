val digitPowers = (0 to 9).map(n => Math.pow(n, 5).toInt)

def fifthPowersSum(n: Int) = n.toString.map(_.asDigit).toList.map(digitPowers(_).toInt).sum == n

// 354294 is the max for 5th power sum done by hand
println(Iterator.from(2).takeWhile(_ < 354294).filter(fifthPowersSum).sum)



// def powerSum(power: Int) = {
// 	val maxDigits = Iterator.from(1).find { n =>
// 		Math.pow(10, n - 1) > Math.pow(9, power)
// 		}.get

// 	val digitPowers = (0 to 9).map(n => Math.pow(n, power).toInt)

// 	(10 until Math.pow(10, maxDigits - 1).toInt).filter { n =>
// 		val digitSum = n.toString.map(c => digitPowers(c.asDigit)).sum
// 		n == digitSum
// 	}.sum
// }

// println(powerSum(5))