package ectclass12;
import java.io.ObjectInputStream.GetField;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import common.utility.CommonUtilities;

public class DateClass {
	private static String dayOfTheWeek(int day) {
		switch(day) {
		case 0: return "일요일";
		case 1: return "월요일";
		case 2: return "화요일";
		case 3: return "수요일";
		case 4: return "목요일";
		case 5: return "금요일";
		default: return "토요일";
		}
	}
	
	private static String getDate(Date date) {
		return 
				String.format(
						"%d년 %d월 %d일 %d시 %d분 %d초", 
						date.getYear()+1900,
						date.getMonth()+1,
						date.getDate(),
						date.getHours(),
						date.getMinutes(),
						date.getSeconds());
	}
	
	public static void main(String[] args) throws ParseException {
		//시스템 날짜가 찍힘
		Date today = new Date();
		System.out.println("today:"+today); //인스턴스
		System.out.println(today.toString()); //문자열
		
		//deprecated
		System.out.println("년도"+(today.getYear()+1900));
		System.out.println("오늘은 무슨 요일이죠?");
		
		//int getDay():숫자 반환(0:일~ 6:토)
		System.out.println(dayOfTheWeek(today.getDay()));
		
		
		Date pasteDate = new Date(1970-1900,0,1,0,0,1);
		System.out.println(getDate(pasteDate));
		//우리 나라와 그리니치의 시간차가 9시간이어서 더해줘야함
		System.out.println((long)pasteDate.getTime()+(9*60*60*1000));
		
		
		//Calendar cal = new Calendar(); X
		Calendar cal = Calendar.getInstance();
		System.out.println("cal.toString()"+cal.toString());//주소안찍힘
		//
		System.out.println("년도:"+cal.get(Calendar.YEAR));
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
		case 1: System.out.println("일요일"); break;
		case 2: System.out.println("월요일"); break;
		case 3: System.out.println("화요일"); break;
		case 4: System.out.println("수요일"); break;
		case 5: System.out.println("목요일"); break;
		case 6: System.out.println("금요일"); break;
		default: System.out.println("토요일"); break;
		}
		
		System.out.println(
				String.format(
						"%d년 %d월 %d일 %s %d시 %d분 %d초", 
						cal.get(Calendar.YEAR),
						cal.get(Calendar.MONTH)+1,
						cal.get(Calendar.DATE),
						cal.get(Calendar.AM_PM)==0?"오전":"오후",
						cal.get(Calendar.HOUR),
						cal.get(Calendar.MINUTE),
						cal.get(Calendar.SECOND)));
		
		//Calendar 타입으로 날짜 설정 - set()메소드
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal1.set(2020,7,10);
		cal2.set(2021, 0, 28);
		String date1String = 
				String.format("%d:%d:%d", 
					cal1.get(Calendar.YEAR),
					cal1.get(Calendar.MONTH)+1,
					cal1.get(Calendar.DATE));
		String date2String = 
				String.format("%d:%d:%d", 
					cal2.get(Calendar.YEAR),
					cal2.get(Calendar.MONTH)+1,
					cal2.get(Calendar.DATE));
		//System.out.println(cal2-cal1); 자바는 날짜빼기 안된다
		System.out.println(date1String);
		System.out.println(date2String);
		
		//SDF
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("dateFormat:"+dateFormat);
		System.out.println("dateFormat:"+dateFormat.toString());
		System.out.println("today:"+today);
		System.out.println("today:"+dateFormat.format(today));
		System.out.println("paste:"+pasteDate);
		System.out.println("paste:"+dateFormat.format(pasteDate));
		System.out.println("오늘 날짜:"+dateFormat.format(new Date()));
		
		dateFormat.applyPattern("yyyy년 M월 d일 a H시 M분 s초입니다");
		System.out.println("today:"+dateFormat.format(today));
		System.out.println("paste:"+dateFormat.format(pasteDate));
		System.out.println("오늘 날짜:"+dateFormat.format(new Date()));
		
		dateFormat.applyPattern("yyyy/MM/dd");
		String stringDate = "2020/08/1";
		Date parseDate = dateFormat.parse(stringDate);
		System.out.println("parseDate:"+parseDate);
		
		System.out.println("날짜 패턴:"+dateFormat.toPattern());
		String stFDate = "2020.1.21";
		String stSDate = "2020.1.22";
		SimpleDateFormat simple = new SimpleDateFormat("yyyy.MM.dd");
		Date fDate = simple.parse(stFDate);
		Date sDate = simple.parse(stSDate);
		
		long fTime = fDate.getTime();
		long sTime = sDate.getTime();
		long diff = sTime - fTime;
		System.out.println("diff:"+diff);
		System.out.println("초단위:"+diff/1000);
		System.out.println("분단위:"+diff/(1000*60));
		System.out.println("시간단위:"+diff/(1000*60*60));
		System.out.println("일단위:"+diff/(1000*60*60*24));
		
		System.out.println("수료일까지 남은 일수:"
				+CommonUtilities.getDifferenceDates(
						"2020-8-24", "2021-1-28", "yyyy-MM-dd", 'D'));
		System.out.println(
				fDate.after(sDate)?"fDate가 채신이다":"sDate가 채신이다");
		System.out.println(
				fDate.before(sDate)?"sDate가 채신이다":"fDate가 채신이다");
		
		System.out.println(
				fDate.equals(sDate)?"두 날짜가 같다":"두 날짜가 다르다");
		
		System.out.println(fDate.compareTo(sDate));//-1
		System.out.println(sDate.compareTo(fDate));//1
		
	}
}
