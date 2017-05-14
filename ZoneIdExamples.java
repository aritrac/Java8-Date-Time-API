import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Locale;


public class ZoneIdExamples {
	public static void main(String[] args) {
		System.out.println("Zone Id Example");
		zoneIdExample();
		System.out.println("Zone Id System Default Example");
		zoneIdSystemDefaultExample();
		System.out.println("Zone Id Get Id Example");
		zoneIdGetIdExample();
		System.out.println("Zone Id Get Display Name Example");
		zoneIdGetDisplayName();
	}
	
	public static void zoneIdExample(){
		ZoneId zoneid1 = ZoneId.of("Asia/Kolkata");  
	    ZoneId zoneid2 = ZoneId.of("Asia/Tokyo");  
	    LocalTime id1 = LocalTime.now(zoneid1);  
	    LocalTime id2 = LocalTime.now(zoneid2);  
	    System.out.println(id1);  
	    System.out.println(id2);  
	    System.out.println(id1.isBefore(id2));
	}
	
	public static void zoneIdSystemDefaultExample(){
		ZoneId zone = ZoneId.systemDefault();     
	    System.out.println(zone);
	}
	
	public static void zoneIdGetIdExample(){
		ZoneId z = ZoneId.systemDefault();  
	    String s = z.getId();  
	    System.out.println(s);
	}
	
	public static void zoneIdGetDisplayName(){
		ZoneId z = ZoneId.systemDefault();  
	    System.out.println(z.getDisplayName(TextStyle.FULL, Locale.ROOT));
	}
}
