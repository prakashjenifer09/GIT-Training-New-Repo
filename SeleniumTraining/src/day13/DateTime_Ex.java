package day13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime_Ex {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("Current Date : "+date);
		System.out.println("Extract Month from the date object : "+date.getMonthValue());
		System.out.println("Extract Year from the date object : "+date.getYear());
		System.out.println("Day of Months : "+date.getDayOfMonth());
		System.out.println("Day of years : "+date.getDayOfYear());
		System.out.println("Length of the Month : "+date.lengthOfMonth());
		System.out.println("Length of the Year : "+date.lengthOfYear());
		System.out.println("Is Leap Year : "+date.isLeapYear());
		LocalDate yesterday = date.minusDays(1);
		System.out.println("Yesterday is : "+yesterday);
		LocalDate independantDay = LocalDate.of(1947, 8, 15);
		System.out.println("Current date is : "+independantDay);
		System.out.println("Extract Month from the date object : "+independantDay.getMonthValue());
		System.out.println("Extract Year from the date object : "+independantDay.getYear());
		System.out.println("Day of Months : "+independantDay.getDayOfMonth());
		System.out.println("Day of years : "+independantDay.getDayOfYear());
		System.out.println("Day of Week : "+independantDay.getDayOfWeek());
		
		LocalTime time = LocalTime.now();
		System.out.println("Current Time is : "+time);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Local Date and Time is : "+dateTime);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yy hh:mm:ss");
		System.out.println("Data and Time in my format is : "+dateTime.format(format));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
