package b_question;

import java.util.Scanner;

public class B2525 {

	public static void main(String[] args) {
		//	훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때, 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.
		Scanner scan = new Scanner(System.in);
		int hour = scan.nextInt();
		int minute = scan.nextInt();
		int cook = scan.nextInt();
		
		
		if( minute + cook >= 60 ) {
			hour++;
			minute = ( minute + cook) - 60;
			if( minute >= 60) {
				hour++;
				minute -= 60;
			}	
			if( hour >= 24 ) {
				hour -= 24;
			}
			System.out.println("조리 끝나는 시간1 : " + hour + "시" + minute + "분");
			
			
		}else {
			minute += cook;
			System.out.println("조리 끝나는 시간3 : " + hour + "시" + minute + "분");
		}
				
		
		
		scan.close();
		
	}

}
