import java.time.*;

public class LocalDateExamples {
	public static void main(String[] args) {
		System.out.println("LocalDate example");
		localDateExample();
		System.out.println("Leap Year Example");
		isLeapYear();
		System.out.println("Add Date And Time Example");
		addDateAndTime();
	}

	// LocalDate Example
	public static void localDateExample() {
		LocalDate date = LocalDate.now();
		LocalDate yesterday = date.minusDays(1);
		LocalDate tomorrow = yesterday.plusDays(2);
		System.out.println("Today date: " + date);
		System.out.println("Yesterday date: " + yesterday);
		System.out.println("Tommorow date: " + tomorrow);
	}

	// Leap Year Example
	public static void isLeapYear() {
		LocalDate date1 = LocalDate.of(2017, 1, 13);
		System.out.println(date1 + " is a leap year? " + date1.isLeapYear());
		LocalDate date2 = LocalDate.of(2016, 9, 23);
		System.out.println(date2 + " is a leap year? " + date2.isLeapYear());
	}
	
	//Add Date With Time
	public static void addDateAndTime(){
		LocalDate date = LocalDate.of(2017, 1, 13);  
	    LocalDateTime datetime = date.atTime(1,50,9);      
	    System.out.println(datetime); 
	}
}
