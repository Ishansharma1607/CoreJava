package com.lti.abstractt;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeDemo {

	public static void main(String[] args) {
	LocalDateTime dt = LocalDateTime.now();
	System.out.println(dt);
	//to get current zone
	ZonedDateTime currentZone = ZonedDateTime.now();
	System.out.println("Current Zone "+currentZone.getZone());
	
	ZoneId z = ZoneId.of("Asia/Tokyo");
	ZonedDateTime z1 = currentZone.withZoneSameInstant(z);
	System.out.println(z1);
	
	//Displaying the date and time in diff formats I
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
	String str = currentZone.format(formatter);
	System.out.println("Current date and time "+str);
	}

}
