package sit707_tasks;

/**
 * @author Ahsan Habib
 */
public class DateUtil {

	// Months in order 0-11 maps to January-December.
	private static String[] MONTHS = new String[] {
			"January", "February", "March", "April", "May", "June", 
			"July", "August", "September", "October", "November", "December"
	};
	
	private int day, month, year;
	
	/*
	 * Constructs object from given day, month and year.
	 */
	public DateUtil(int day, int month, int year) {
		
		if(day < 1 || (month == 2 && day > 29) || (day > 28 && month == 2 && !LeapYear(year)) || 
			(day > 30 && (month == 4 || month == 6 || month == 9 || month == 11)) ||
			(day > 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)))
		{
			throw new RuntimeException("Invalid day: " + day + "/" + month + "/" + year);
		}
		
		this.day = day;
		this.month = month;
		this.year = year;
	}
	private boolean LeapYear(int year)
	{
		return (year % 4==0 && year % 100 !=0) || (year %400 == 0);
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}
	
	/**
	 * Increment one day.
	 */
	public void increment() {
		if (day < monthDuration(month, year)) {
			// At least 1 day remaining in current month of year.
			day++;
		} else if (month < 12) {
			// Last day of a month AND month is less than December, so +1d is first day of next month.
			day = 1;
			month++;
		} else {
			// Month is December, so +1d is 1st January next year.
			day = 1;
			month = 1;
			year++;
		}
	}
	
	/**
	 * Decrement one day from current date.
	 */
	public void decrement() {
		if (day > 1) {
			day--;
		} else if (month > 1) {
			month--;
			day = monthDuration(month, year);
		} else {
			month = 12;
			year--;
			day = monthDuration(month, year);
		}
	}
	
	/**
	 * Calculate duration of current month of year.
	 * @param month
	 * @param year
	 * @return
	 */
	public static int monthDuration(int month, int year) {		
		if (month == 2 && year % 4 == 0) {
			// February leap year?
			return 29;			
		} else if (month == 2) {  
			// normal 28 days February
			return 28;
			
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			// 30 days' months
			return 30;			
		}
		return 31;  // rest are 31 days' months.
	}
	
	/**
	 * User friendly output.
	 */
	public String toString() {
		return day + " " + MONTHS[month - 1] + " " + year;
	}
	
}
