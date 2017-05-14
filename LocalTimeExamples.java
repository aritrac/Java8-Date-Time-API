import java.time.*;
import java.time.temporal.ChronoUnit;

public class LocalTimeExamples {
	public static void main(String[] args) {
		System.out.println("Local Time Example");
		localTimeExample();
		System.out.println("Local Time Of Example");
		localTimeOfExample();
		System.out.println("Local Time Minus Hours Example");
		localTimeMinusHoursExample();
		System.out.println("Local Time Minus Minutes Example");
		localTimeMinusMinutesExample();
		System.out.println("Local Time Plus Hours Example");
		localTimePlusHoursExample();
		System.out.println("Local Time Plus Minutes Example");
		localTimePlusMinutesExample();
		System.out.println("Local Time Difference Between Time Zones Example");
		timeDiffBetweenTimeZones();
	}

	public static void localTimeExample() {
		LocalTime time = LocalTime.now();
		System.out.println(time);
	}

	public static void localTimeOfExample() {
		LocalTime time = LocalTime.of(10, 43, 12);
		System.out.println(time);
	}
	
	public static void localTimeMinusHoursExample(){
		LocalTime time1 = LocalTime.of(10,43,12);  
	    System.out.println(time1);  
	    LocalTime time2 = time1.minusHours(2);
	    System.out.println(time2);
	}
	
	public static void localTimeMinusMinutesExample(){
		LocalTime time1 = LocalTime.of(10,43,12);  
	    System.out.println(time1);  
	    LocalTime time2 = time1.minusMinutes(34);
	    System.out.println(time2);
	}
	
	public static void localTimePlusHoursExample(){
		LocalTime time1 = LocalTime.of(10,43,12);  
	    System.out.println(time1);  
	    LocalTime time2 = time1.plusHours(2);
	    System.out.println(time2);
	}
	
	public static void localTimePlusMinutesExample(){
		LocalTime time1 = LocalTime.of(10,43,12);  
	    System.out.println(time1);  
	    LocalTime time2 = time1.plusMinutes(34);
	    System.out.println(time2);
	}
	
	public static void timeDiffBetweenTimeZones(){
		ZoneId zone1 = ZoneId.of("Asia/Kolkata");  
	    ZoneId zone2 = ZoneId.of("Asia/Tokyo");  
	    LocalTime time1 = LocalTime.now(zone1);  
	    System.out.println("India Time Zone: "+time1);  
	    LocalTime time2 = LocalTime.now(zone2);  
	    System.out.println("Japan Time Zone: "+time2);  
	    long hours = ChronoUnit.HOURS.between(time1, time2);  
	    System.out.println("Hours between two Time Zone: "+hours);  
	    long minutes = ChronoUnit.MINUTES.between(time1, time2);  
	    System.out.println("Minutes between two time zone: "+minutes);
	}
}
