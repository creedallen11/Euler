/* How many Sundays fell on the first of the month during the 
twentieth century (1 Jan 1901 to 31 Dec 2000)? */
class s19 extends Solution {

	def leapYear(year: Int) = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)

	val daysInMonth = List(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

	def daysInMonth(month: Int, year: Int): Int = {
		if (leapYear(year) && month == 1) 29 else daysInMonth(month)
	}

	def countSundays(month: Int, year: Int, dayOfWeek: Int, count: Int, endYear: Int): Int = {
		if (year == endYear) count
		else {
			val newMonth = (month + 1) % 12
			val newYear = year + ((month + 1) / 12)
			val newDay = (dayOfWeek + daysInMonth(month, year)) % 7
			val newCount = if (dayOfWeek == 0) count + 1 else count
			countSundays(newMonth, newYear, newDay, newCount, endYear)
		}
	}

	def solve() = {
		countSundays(0, 1901, 2, 0, 2001).toString
	}
}