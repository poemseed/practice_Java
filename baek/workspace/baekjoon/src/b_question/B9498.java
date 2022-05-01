package b_question;

import java.util.Scanner;

public class B9498 {

	public static void main(String[] args) {
		// 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		Scanner scan = new Scanner(System.in);
		
		int textScore = scan.nextInt();
		
		if( textScore >= 90 || textScore == 100 ) {
			System.out.println("A");
		}else if( textScore >= 80 || textScore <= 89 ) {
			System.out.println("B");
		}else if(textScore >= 70 || textScore <= 79 ) {
			System.out.println("c");
		}else if(textScore >= 60 || textScore <= 69 ) {
			System.out.println("c");
		}else {
			System.out.println("F");
		}
		
		
		
		
		
		
		
		scan.close();
	}

}
