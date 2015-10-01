def sumDigits(x: BigInt) = x.toString.map(_.asDigit).sum
val answer = sumDigits(BigInt(2).pow(1000))

println(answer)


println((BigInt(2) << (1000 - 1)).toString.map(_.asDigit).sum)