import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;


public class MonthExamples {
	public static void main(String[] args) {
		System.out.println("Month Example");
		monthExample();
		System.out.println("Month Get Value Example");
		monthGetValueExample();
		System.out.println("Month Minus Example");
		monthMinusExample();
		System.out.println("Month Plus Example");
		monthPlusExample();
		System.out.println("Month Length Example");
		monthLengthExample();
	}
	
	public static void monthExample(){
		Month month = Month.valueOf("January".toUpperCase());  
        System.out.printf("For the month of %s all Sunday are:%n", month);  
        LocalDate localdate = Year.now().atMonth(month).atDay(1).  
        with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));  
        Month mi = localdate.getMonth();  
        while (mi == month) {  
            System.out.printf("%s%n", localdate);  
            localdate = localdate.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));  
            mi = localdate.getMonth();  
        } 
	}
	
	public static void monthGetValueExample(){
		Month month = Month.from(LocalDate.now());  
	    System.out.println(month.getValue());  
	    System.out.println(month.name());
	}
	
	public static void monthMinusExample(){
		Month month = Month.from(LocalDate.now());    
	    System.out.println(month.minus(2));
	}
	
	public static void monthPlusExample(){
		Month month = Month.from(LocalDate.now());    
	    System.out.println(month.plus(2)); 
	}
	
	public static void monthLengthExample(){
		Month month = Month.from(LocalDate.now());    
	    System.out.println("Total Number of days: "+month.length(true)); 
	}
}
