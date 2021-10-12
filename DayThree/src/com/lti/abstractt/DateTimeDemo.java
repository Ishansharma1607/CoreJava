package com.lti.abstractt;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("Date " +date);
		
		LocalTime time = LocalTime.now();
		System.out.println("Time "+time);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("Date and time "+dt);
		
		//Displaying the date and time in diff formats
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-yyyy hh:mm:ss");
		String str = dt.format(formatter);
		System.out.println("Current date and time "+formatter);
		
		Month month = dt.getMonth();
		int day = dt.getDayOfMonth();
		int hours = dt.getHour();
		
		System.out.println("Month "+month);
		System.out.println("Day "+day);
		
		//display some Specific dates
		LocalDate date1 = LocalDate.of(1947,8,15);
		System.out.println("Independence day "+date1);
		
		//display some specific time
		LocalDateTime dt1 = dt.withDayOfMonth(21).withYear(2017).withMonth(06).withHour(3);
		System.out.println("dt1");

	}

}
