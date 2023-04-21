package ch5.sec12;

import java.util.Calendar;

public class WeekExample {
	public static void main(String[] args) {
		//요일표시
		week today=null;
		//컨트롤하고 누르면 원래 페이지로 올라감
		
		Calendar cal=Calendar.getInstance();
		
		int Week=cal.get(Calendar.DAY_OF_WEEK);
		
		switch(Week) {
			case 1: today=week.SUNDAY;
					break;
			case 2: today=week.MONDAY;
					break;
			case 3: today=week.TUESDAY;
					break;
			case 4: today=week.WEDNESDAY;
					break;
			case 5: today=week.THURSDAY;
					break;
			case 6: today=week.FRIDAY;
					break;
			case 7: today=week.SATURDAY;
		}
		
		if(today==week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다");
		}else {
			System.out.println("열심히 자바를 공부합니다");
		}
		
		}
		
	}
