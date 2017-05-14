import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;


public class DayOfWeekExamples {
	public static void main(String[] args) {
		System.out.println("Day Of Week Get Example");
		dayOfWeekGetExample();
		System.out.println("Day Of Week Of Example");
		dayOfWeekOfExample();
		System.out.println("Day Of Week Plus Example");
		dayOfWeekPlusExample();
		System.out.println("Day Of Week Minus Example");
		dayOfWeekMinusExample();
	}
	
	public static void dayOfWeekGetExample(){
		LocalDate localDate = LocalDate.of(2017, Month.JANUARY, 25);  
	    DayOfWeek dayOfWeek = DayOfWeek.from(localDate);  
	    System.out.println(dayOfWeek.get(ChronoField.DAY_OF_WEEK));
	}
	
	public static void dayOfWeekOfExample(){
		DayOfWeek day = DayOfWeek.of(5);  
	    System.out.println(day.name());  
	    System.out.println(day.ordinal());  
	    System.out.println(day.getValue());
	}
	
	public static void dayOfWeekPlusExample(){
		LocalDate date = LocalDate.of(2017, Month.JANUARY, 31);  
	    DayOfWeek day = DayOfWeek.from(date);  
	    System.out.println(day.getValue());  
	    day = day.plus(3);  
	    System.out.println(day.getValue());
	}
	
	public static void dayOfWeekMinusExample(){
		LocalDate date = LocalDate.of(2017, Month.JANUARY, 31);  
	    DayOfWeek day = DayOfWeek.from(date);  
	    System.out.println(day.getValue());  
	    day = day.minus(3);  
	    System.out.println(day.getValue()); 
	}
}
