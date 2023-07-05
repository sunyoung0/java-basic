package chapter4;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

//날짜 및 시간과 관련된 클래스
public class DateTimeClass {

	public static void main(String[] args) {
		
		// Date 클래스
		// 시간을 1970년 1월 1일 0시 0분 0초 기준으로 경과한 시간을 표현
		Date nowDate = new Date();
		System.out.println(nowDate);
		System.out.println(nowDate.getMonth());
		nowDate.setHours(nowDate.getHours() +3);
		
		// Calendar 클래스 - 추상클래스임
		// Date 클래스보다 조금 더 유연하게 날짜 및 시간을 관리할 수 있는 클래스 
		Calendar nowCalendar = Calendar.getInstance();
		System.out.println(nowCalendar);
		int yearCalendar = nowCalendar.get(Calendar.YEAR);
		System.out.println(yearCalendar);
		int monthCalendar = nowCalendar.get(Calendar.MONTH);
		System.out.println(monthCalendar);
		int dayCalendar = nowCalendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(dayCalendar);
		
		// LocalDateTime 클래스
		// Java 8부터 도입된 날짜와 시간을 관리해주는 클래스
		// Date, Calendar 클래스보다 더욱 직관적으로 날짜 및 시간을 표현할 수 있음
		// LocalDate, LocalTime, LocalDateTime
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		LocalDate localDate2 = LocalDate.of(2020, 12, 25);	// 날짜를 지정 
		System.out.println(localDate2);
		int yearLocalDate = localDate.getYear();
		System.out.println(yearLocalDate);
		localDate = localDate.plusYears(2).minusMonths(1);
		System.out.println(localDate);
		
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		LocalTime localTime2 = LocalTime.of(9, 30, 15);
		System.out.println(localTime2);
		int hourLocalTime = localTime.getHour();
		System.out.println(hourLocalTime);
		localTime = localTime.plusHours(1).minusMinutes(15);
		System.out.println(localTime);

		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDateTime localDateTime2 = LocalDateTime.of(localDate, localTime);
		System.out.println(localDateTime);
		System.out.println(localDateTime2);
		
		// LocalDateTime을 Date로 변환
		Date now = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
		System.out.println(now);
		
		// Date를 String으로 변환
		// SimpleDateFormat 클래스 사용
		// 날짜의 패턴 : y - 년 / M - 월 / d - 일 / h - 시 / m - 분 / s - 초
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
		String dateString = simpleDateFormat.format(now);
		System.out.println(dateString);
		
		// LocalDateTime을 String으로 변환
		// DateTimeFormatter 클래스 사용
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd hh:mm:ss");
		String localDateTimeString = localDateTime.format(dateTimeFormatter);
		System.out.println(localDateTimeString);
		
		
		
	}

}
