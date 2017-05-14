import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;


public class InstantExamples {
	public static void main(String[] args) {
		System.out.println("Instant Parse Example");
		instantParseExample();
		System.out.println("Instant Now Example");
		instantNowExample();
		System.out.println("Instant Minus Example");
		instantMinusExample();
		System.out.println("Instant Plus Example");
		instantPlusExample();
		System.out.println("Instant Is Supported Example");
		instantIsSupportedExample();
	}
	
	public static void instantParseExample(){
		Instant inst = Instant.parse("2017-02-03T10:37:30.00Z");  
	    System.out.println(inst);
	}
	
	public static void instantNowExample(){
		Instant instant = Instant.now();  
	    System.out.println(instant);
	}
	
	public static void instantMinusExample(){
		Instant instant = Instant.parse("2017-02-03T11:25:30.00Z");  
	    instant = instant.minus(Duration.ofDays(125));  
	    System.out.println(instant); 
	}
	
	public static void instantPlusExample(){
		Instant inst1 = Instant.parse("2017-02-03T11:25:30.00Z");  
	    Instant inst2 = inst1.plus(Duration.ofDays(125));  
	    System.out.println(inst2);
	}
	
	public static void instantIsSupportedExample(){
		Instant inst = Instant.parse("2017-02-03T11:35:30.00Z");  
	    System.out.println(inst.isSupported(ChronoUnit.DAYS));  
	    System.out.println(inst.isSupported(ChronoUnit.YEARS));
	}
}
