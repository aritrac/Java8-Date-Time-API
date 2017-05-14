import java.time.OffsetDateTime;


public class OffsetDateTimeExamples {
	public static void main(String[] args) {
		System.out.println("Offset Date Time Get Day Of Month Example");
		offsetDateTimeGetDayOfMonthExample();
		System.out.println("Offset Date Time Get Day Of Year Example");
		offsetDateTimeGetDayOfYearExample();
		System.out.println("Offset Date Time Get Day Of Week Example");
		offsetDateTimeGetDayOfWeek();
		System.out.println("Offset Date Time To Local Date Example");
		offsetDateTimeToLocalDateExample();
		System.out.println("Offset Date Time Minus Days Example");
		offsetDateTimeMinusDaysExample();
		System.out.println("Offset Date Time Plus Days Example");
		offsetDateTimePlusDaysExample();
	}
	
	public static void offsetDateTimeGetDayOfMonthExample(){
		OffsetDateTime offsetDT = OffsetDateTime.now();  
        System.out.println(offsetDT.getDayOfMonth());
	}
	
	public static void offsetDateTimeGetDayOfYearExample(){
		OffsetDateTime offsetDT = OffsetDateTime.now();  
        System.out.println(offsetDT.getDayOfYear()); 
	}
	
	public static void offsetDateTimeGetDayOfWeek(){
		OffsetDateTime offsetDT = OffsetDateTime.now();  
        System.out.println(offsetDT.getDayOfWeek());
	}
	
	public static void offsetDateTimeToLocalDateExample(){
		OffsetDateTime offsetDT = OffsetDateTime.now();  
        System.out.println(offsetDT.toLocalDate());
	}
	
	public static void offsetDateTimeMinusDaysExample(){
		OffsetDateTime offset = OffsetDateTime.now();  
	    OffsetDateTime value =  offset.minusDays(240);  
	    System.out.println(value);
	}
	
	public static void offsetDateTimePlusDaysExample(){
		OffsetDateTime offset = OffsetDateTime.now();  
	    OffsetDateTime value =  offset.plusDays(240);  
	    System.out.println(value);
	}
}
