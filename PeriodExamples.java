import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;


public class PeriodExamples {
	public static void main(String[] args) {
		System.out.println("Period Add To Example");
		periodAddToExample();
		System.out.println("Period Of Example");
		periodOfExample();
		System.out.println("Period Minus Example");
		periodMinusExample();
		System.out.println("Period Plus Example");
		periodPlusExample();
	}
	
	public static void periodAddToExample(){
		Period period = Period.ofDays(24);  
	    Temporal temp = period.addTo(LocalDate.now());  
	    System.out.println(temp);
	}
	
	public static void periodOfExample(){
		Period period = Period.of(2017,02,16);  
		System.out.println(period.toString());
	}
	
	public static void periodMinusExample(){
		Period period1 = Period.ofMonths(4);   
	    Period period2 = period1.minus(Period.ofMonths(2));  
	    System.out.println(period2);
	}
	
	public static void periodPlusExample(){
		Period period1 = Period.ofMonths(4);   
	    Period period2 = period1.plus(Period.ofMonths(2));  
	    System.out.println(period2);
	}
}
