import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;


public class YearMonthExamples {
	public static void main(String[] args) {
		System.out.println("Year Month Now Example");
		yearMonthNowExample();
		System.out.println("Year Month Format Example");
		yearMonthFormatExample();
		System.out.println("Year Month Get Example");
		yearMonthGetExample();
		System.out.println("Year Month Plus Example");
		yearMonthPlusExample();
		System.out.println("Year Month Minus Example");
		yearMonthMinusExample();
	}
	
	public static void yearMonthNowExample(){
		YearMonth ym = YearMonth.now();  
		System.out.println(ym);
	}
	
	public static void yearMonthFormatExample(){
		YearMonth ym = YearMonth.now();  
	    String s = ym.format(DateTimeFormatter.ofPattern("MM yyyy"));  
	    System.out.println(s);
	}
	
	public static void yearMonthGetExample(){
		YearMonth y = YearMonth.now();  
	    long l1 = y.get(ChronoField.YEAR);  
	    System.out.println(l1);  
	    long l2 = y.get(ChronoField.MONTH_OF_YEAR);  
	    System.out.println(l2);
	}
	
	public static void yearMonthPlusExample(){
		YearMonth ym1 = YearMonth.now();  
	    YearMonth ym2 = ym1.plus(Period.ofYears(2));  
	    System.out.println(ym2);
	}
	
	public static void yearMonthMinusExample(){
		YearMonth ym1 = YearMonth.now();  
	    YearMonth ym2 = ym1.minus(Period.ofYears(2));  
	    System.out.println(ym2);
	}
}	
