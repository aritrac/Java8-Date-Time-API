import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class MonthDayExamples {
	public static void main(String[] args) {
		System.out.println("Month Day Example");
		monthDayExample();
		System.out.println("Month Day Is Valid Year Example");
		monthDayIsValidYearExample();
		System.out.println("Month Day Get Example");
		monthDayGetExample();
		System.out.println("Month Day Range Example");
		monthDayRangeExample();
	}

	public static void monthDayExample() {
		MonthDay monthDay = MonthDay.now();
		LocalDate date = monthDay.atYear(1994);
		System.out.println(date);
	}

	public static void monthDayIsValidYearExample() {
		MonthDay month = MonthDay.now();
		boolean b = month.isValidYear(2012);
		System.out.println(b);
	}

	public static void monthDayGetExample() {
		MonthDay month = MonthDay.now();
		long n = month.get(ChronoField.MONTH_OF_YEAR);
		System.out.println(n);
	}

	public static void monthDayRangeExample() {
		MonthDay month = MonthDay.now();
		ValueRange r1 = month.range(ChronoField.MONTH_OF_YEAR);
		System.out.println(r1);
		ValueRange r2 = month.range(ChronoField.DAY_OF_MONTH);
		System.out.println(r2);
	}
}
