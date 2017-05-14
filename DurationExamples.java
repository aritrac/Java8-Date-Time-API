import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;


public class DurationExamples {
	public static void main(String[] args) {
		System.out.println("Duration Get Example");
		durationGetExample();
		System.out.println("Duration Is Negative Example");
		durationIsNegativeExample();
		System.out.println("Duration Between Example");
		durationBetweenExample();
		System.out.println("Duration Minus Example");
		durationMinusExample();
		System.out.println("Duration Plus Example");
		durationPlusExample();
	}
	
	public static void durationGetExample(){
		Duration d = Duration.between(LocalTime.NOON,LocalTime.MAX);  
	    System.out.println(d.get(ChronoUnit.SECONDS));
	}
	
	public static void durationIsNegativeExample(){
		Duration d1 = Duration.between(LocalTime.MAX,LocalTime.NOON);  
	    System.out.println(d1.isNegative());  
	    Duration d2 = Duration.between(LocalTime.NOON,LocalTime.MAX);  
	    System.out.println(d2.isNegative()); 
	}
	
	public static void durationBetweenExample(){
		Duration d = Duration.between(LocalTime.NOON,LocalTime.MAX);  
	    System.out.println(d.get(ChronoUnit.SECONDS));
	}
	
	public static void durationMinusExample(){
		Duration d1 = Duration.between(LocalTime.NOON,LocalTime.MAX);  
	    System.out.println(d1.getSeconds());  
	    Duration d2 = d1.minus(d1);  
	    System.out.println(d2.getSeconds());
	}
	
	public static void durationPlusExample(){
		Duration d1 = Duration.between(LocalTime.NOON,LocalTime.MAX);  
	    System.out.println(d1.getSeconds());  
	    Duration d2 = d1.plus(d1);  
	    System.out.println(d2.getSeconds());
	}
}
