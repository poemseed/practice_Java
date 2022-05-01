package b_question;

import java.util.Scanner;

public class B2480 {

	public static void main(String[] args) {
		// 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다. 
		// 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
		// 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
		// 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
		// 3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
		Scanner scan = new Scanner(System.in);
		String answer = scan.nextLine();
		String data[] = answer.split(" ");
		int sum = 0;
		
		
			if( data[0].equals(data[1]) && data[0].equals(data[2]) ) {
				int num = Integer.parseInt(data[0]);
				sum = 10000 + num * 1000;
//				System.out.println("sum = "+sum);
			}else if( data[0].equals(data[1]) && !(data[0].equals(data[2])) ||
					!(data[0].equals(data[1])) && data[0].equals(data[2]) || 
					!(data[0].equals(data[1])) && data[1].equals(data[2]) ) {
				int num = Integer.parseInt(data[0]);
				sum = 1000 + num * 100;
//				System.out.println("sum = "+sum);
			}else  {
				int num = Integer.parseInt(data[0]);
				sum = num * 100;
			}
		
			System.out.println("sum = "+sum);
		
		
		
		
		
		scan.close();
	}

}
