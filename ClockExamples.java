import java.time.Clock;
import java.time.Duration;


public class ClockExamples {
	public static void main(String[] args) {
		System.out.println("Clock Get Zone Example");
		clockGetZoneExample();
		System.out.println("Clock Instant Example");
		clockInstantExample();
		System.out.println("Clock System UTC Example");
		clockSystemUTCExample();
		System.out.println("Clock System UTC Offset Example");
		clockOffsetExample();
	}
	
	public static void clockGetZoneExample(){
		Clock c = Clock.systemDefaultZone();      
	    System.out.println(c.getZone()); 
	}
	
	public static void clockInstantExample(){
		Clock c = Clock.systemUTC();  
	    System.out.println(c.instant()); 
	}
	
	public static void clockSystemUTCExample(){
		Clock c = Clock.systemUTC();  
	    System.out.println(c.instant());
	}
	
	public static void clockOffsetExample(){
		Clock c = Clock.systemUTC();  
	    Duration d = Duration.ofHours(5);  
	    Clock clock = Clock.offset(c, d);    
	    System.out.println(clock.instant());
	}
}
