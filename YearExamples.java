import java.time.LocalDate;
import java.time.Year;


public class YearExamples {
	public static void main(String[] args) {
		System.out.println("Year Now Example");
		yearNowExample();
		System.out.println("Year At Day Example");
		yearAtDayExample();
		System.out.println("Year Length Example");
		yearLengthExample();
		System.out.println("Year Is Leap Example");
		yearIsLeapExample();
	}
	
	public static void yearNowExample(){
		Year y = Year.now();  
	    System.out.println(y); 
	}
	
	public static void yearAtDayExample(){
		Year y = Year.of(2017);  
	    LocalDate l = y.atDay(123);  
	    System.out.println(l);
	}
	
	public static void yearLengthExample(){
		Year year = Year.of(2017);  
	    System.out.println(year.length());
	}
	
	public static void yearIsLeapExample(){
		Year year = Year.of(2016);  
	    System.out.println(year.isLeap());
	}
}
