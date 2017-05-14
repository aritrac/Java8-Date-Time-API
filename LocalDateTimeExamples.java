import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class LocalDateTimeExamples {
	public static void main(String[] args) {
		System.out.println("Local Date Time Formatting Example");
		localDateTimeFormattingExample();
		System.out.println("Local Date Time Now Example");
		localDateTimeNowExample();
		System.out.println("Local Date Time Get Example");
		localDateTimeGetExample();
		System.out.println("Local Date Time Minus Days Example");
		localDateTimeMinusDaysExample();
		System.out.println("Local Date Time Plus Days Example");
		localDateTimePlusDays();
	}

	public static void localDateTimeFormattingExample() {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Before Formatting: " + now);
		DateTimeFormatter format = DateTimeFormatter
				.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatDateTime = now.format(format);
		System.out.println("After Formatting: " + formatDateTime);
	}

	public static void localDateTimeNowExample() {
		LocalDateTime datetime1 = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter
				.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatDateTime = datetime1.format(format);
		System.out.println(formatDateTime);
	}

	public static void localDateTimeGetExample() {
		LocalDateTime a = LocalDateTime.of(2017, 2, 13, 15, 56);
		System.out.println(a.get(ChronoField.DAY_OF_WEEK));
		System.out.println(a.get(ChronoField.DAY_OF_YEAR));
		System.out.println(a.get(ChronoField.DAY_OF_MONTH));
		System.out.println(a.get(ChronoField.HOUR_OF_DAY));
		System.out.println(a.get(ChronoField.MINUTE_OF_DAY));
	}

	public static void localDateTimeMinusDaysExample() {
		LocalDateTime datetime1 = LocalDateTime.of(2017, 1, 14, 10, 34);
		LocalDateTime datetime2 = datetime1.minusDays(100);
		System.out.println("Before Formatting: " + datetime2);
		DateTimeFormatter format = DateTimeFormatter
				.ofPattern("dd-MM-yyyy HH:mm");
		String formatDateTime = datetime2.format(format);
		System.out.println("After Formatting: " + formatDateTime);
	}

	public static void localDateTimePlusDays() {
		LocalDateTime datetime1 = LocalDateTime.of(2017, 1, 14, 10, 34);
		LocalDateTime datetime2 = datetime1.plusDays(120);
		System.out.println("Before Formatting: " + datetime2);
		DateTimeFormatter format = DateTimeFormatter
				.ofPattern("dd-MM-yyyy HH:mm");
		String formatDateTime = datetime2.format(format);
		System.out.println("After Formatting: " + formatDateTime);
	}
}
