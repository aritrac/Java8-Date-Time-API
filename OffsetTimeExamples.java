import java.time.OffsetTime;
import java.time.temporal.ChronoField;

public class OffsetTimeExamples {
	public static void main(String[] args) {
		System.out.println("Offset Time Example");
		offSetTimeExample();
		System.out.println("Offset Get Hour Example");
		offSetGetHourExample();
		System.out.println("Offset Get Minute Example");
		offSetGetMinuteExample();
		System.out.println("Offset Get Second Example");
		offSetGetSecondExample();
	}

	public static void offSetTimeExample() {
		OffsetTime offset = OffsetTime.now();
		int h = offset.get(ChronoField.HOUR_OF_DAY);
		System.out.println(h);
		int m = offset.get(ChronoField.MINUTE_OF_DAY);
		System.out.println(m);
		int s = offset.get(ChronoField.SECOND_OF_DAY);
		System.out.println(s);
	}
	
	public static void offSetGetHourExample(){
		OffsetTime offset = OffsetTime.now();  
	    int h = offset.getHour();  
	    System.out.println(h+ " hour");
	}
	
	public static void offSetGetMinuteExample(){
		OffsetTime offset = OffsetTime.now();  
	    int m = offset.getMinute();  
	    System.out.println(m+ " minute");
	}
	
	public static void offSetGetSecondExample(){
		OffsetTime offset = OffsetTime.now();  
	    int s = offset.getSecond();  
	    System.out.println(s+ " second");
	}
}
