// implicit class FactorialInt(val num: Int) extends AnyVal {
// 	def ! : BigInt = {
// 		(BigInt(1) to n).product
// 	}
// }

// // def factorial(n :Int): BigInt = {
// // 	(BigInt(1) to n).product
// // }

// println((40!) / ((20!) * (20!)))


// def pascalStream(row: List[Int]): Stream[List[Int]] =
//   Stream.cons(row, pascalStream(addList(shiftLeft(row), shiftRight(row))))

// def shiftRight(row: List[Int]): List[Int] = 0::row
// def shiftLeft(row: List[Int]): List[Int] = row:::List(0) 
// def addList(l1: List[Int], l2: List[Int]): List[Int] = {
//   (l1 zip l2) map { case (x, y) => x + y }
// } 
// def printTriangle(triangle: Stream[List[Int]], nrows: Int) {
//   val rows = triangle.take(nrows).map(_.mkString(" "))
//   rows foreach { println _ }
// }

// printTriangle(pascalStream(List(1)), 40)


def nChooseR(n: Int, r: Int) = ((BigInt(n) to (n-r+1) by -1).product) / ((BigInt(r) to 1 by -1).product)

println(nChooseR(40 ,20))