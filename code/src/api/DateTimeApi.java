package api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateTimeApi {
public static void main(String[] args) {
	Date date=new Date(); 
	System.out.println(date);
	LocalDate localdate=LocalDate.now();
	System.out.println(localdate);
	LocalTime localtime=LocalTime.now();
	System.out.println(localtime);
	LocalDateTime localdatetime=LocalDateTime.now();
	System.out.println(localdatetime);
	ZoneId zone=ZoneId.systemDefault();
	System.out.println(zone);
}
}
