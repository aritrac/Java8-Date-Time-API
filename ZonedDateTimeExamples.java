import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExamples {
	public static void main(String[] args) {
		System.out.println("Zoned Date Time Example");
		zonedDateTimeExample();
		System.out.println("Zoned Date Time Of And With Zone Same Instant Example");
		zonedDateTimeOfAndWithZoneSameInstantExample();
		System.out.println("Zoned Date Time Get Zone Example");
		zonedDateTimeGetZoneExample();
		System.out.println("Zoned Date Time Minus Example");
		zonedDateTimeMinusExample();
		System.out.println("Zoned Date Time Plus Example");
		zonedDateTimePlusExample();
	}

	public static void zonedDateTimeExample() {
		ZonedDateTime zone = ZonedDateTime
				.parse("2016-10-05T08:20:10+05:30[Asia/Kolkata]");
		System.out.println(zone);
	}

	public static void zonedDateTimeOfAndWithZoneSameInstantExample() {
		LocalDateTime ldt = LocalDateTime.of(2017, Month.JANUARY, 19, 15, 26);
		ZoneId india = ZoneId.of("Asia/Kolkata");
		ZonedDateTime zone1 = ZonedDateTime.of(ldt, india);
		System.out.println("In India Central Time Zone: " + zone1);
		ZoneId tokyo = ZoneId.of("Asia/Tokyo");
		ZonedDateTime zone2 = zone1.withZoneSameInstant(tokyo);
		System.out.println("In Tokyo Central Time Zone:" + zone2);
	}

	public static void zonedDateTimeGetZoneExample() {
		ZonedDateTime zone = ZonedDateTime.now();
		System.out.println(zone.getZone());
	}
	
	public static void zonedDateTimeMinusExample(){
		ZonedDateTime zone= ZonedDateTime.now();  
	    ZonedDateTime m = zone.minus(Period.ofDays(126));  
	    System.out.println(m); 
	}
	
	public static void zonedDateTimePlusExample(){
		ZonedDateTime zone= ZonedDateTime.now();  
	    ZonedDateTime p = zone.plus(Period.ofDays(126));  
	    System.out.println(p); 
	}
}
