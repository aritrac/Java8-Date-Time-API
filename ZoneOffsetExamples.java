import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;


public class ZoneOffsetExamples {
	public static void main(String[] args) {
		System.out.println("Zone Offset Example");
		zoneOffsetExample();
		System.out.println("Zone Offset Of Hours Example");
		zoneOffsetOfHoursExample();
		System.out.println("Zone Offset Of Hours Minutes Example");
		zoneOffsetOfHoursMinutesExample();
		System.out.println("Zone Offset Is Supported");
		zoneOffsetIsSupportedExample();
	}
	
	public static void zoneOffsetExample(){
		ZoneOffset zone = ZoneOffset.UTC;  
	    Temporal temp = zone.adjustInto(ZonedDateTime.now());  
	    System.out.println(temp); 
	}
	
	public static void zoneOffsetOfHoursExample(){
		ZoneOffset zone = ZoneOffset.ofHours(5);  
	    System.out.println(zone); 
	}
	
	public static void zoneOffsetOfHoursMinutesExample(){
		ZoneOffset zone = ZoneOffset.ofHoursMinutes(5,30);  
	    System.out.println(zone);
	}
	
	public static void zoneOffsetIsSupportedExample(){
		ZoneOffset zone = ZoneOffset.UTC;  
	    boolean b1 = zone.isSupported(ChronoField.OFFSET_SECONDS);  
	    System.out.println(b1);  
	    boolean b2 = zone.isSupported(ChronoField.SECOND_OF_MINUTE);  
	    System.out.println(b2); 
	}
}
