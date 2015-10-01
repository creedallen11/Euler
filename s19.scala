val daysInMonth = List(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

def isLeapYear(year: Int) = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)

def daysInMonth(month: Int, year: Int): Int = {
	if (month == 1 && isLeapYear(year)) 29
	else daysInMonth(month)
}

def countSundays(month: Int, year: Int, dayOfWeek: Int, count: Int, endYear: Int): Int = {
	if (year == endYear) count
	else {
		val newMonth = (month + 1) % 12
		val newYear = year + ((month + 1) / 12)
		val newDay = (dayOfWeek + daysInMonth(month, year)) % 7
		val newCount = if (dayOfWeek == 0) count + 1 else count
		// THIS CALL IS TAIL RECURSIVE
		countSundays(newMonth, newYear, newDay, newCount, endYear)
	}
}
	
println(countSundays(0, 1901, 2, 0, 2001))