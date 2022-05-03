package b_question;

import java.util.Scanner;

public class B2439 {
	public static void main(String[] args) {
		// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		// 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
		// 출력결과
		//    *
		//   **
		//  ***
		// ****
		//*****
		
		Scanner scan = new Scanner(System.in);
		int num =  scan.nextInt();
		
		for( int i = 0; i < num; i++ ) {
			for( int j = num; j > i+1; j-- ) {
				System.out.print(" ");
			}
			for( int j = 0; j < i; j++ ) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		
		scan.close();
		
		
	}

}
