package b_question;

import java.util.Scanner;

public class B2562 {

	public static void main(String[] args) {
		// 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
		// 예를 들어, 서로 다른 9개의 자연수
		// 3, 29, 38, 12, 57, 74, 40, 85, 61
		// 이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
		Scanner scan = new Scanner(System.in);
		
		int[] numArr = new int[9];	// 입력받은 숫자를 담을 배열
		int max = 0;				// 최대값
		int iNum = 0;				// 최대값이 몇번째였는지를 담을 변수
		
			
			for( int i = 0; i < 9; i++ ) {	
				int num = scan.nextInt();	
				// 배열에 입력받은 값을 할당
				numArr[i] = num;				
				
				// 비교하여 더 큰 수를 max에 재할당
				if( max < numArr[i]) {
					max = numArr[i];
					// 인덱스값은 0부터 시작하므로 +1을 해줌
					iNum = i + 1;
				}
			}

		// 최대값
		System.out.println( max );
		// 최대값이 입력된 순서
		System.out.println( iNum + 1 );
		
		scan.close();
		
		
		
		
		
	}

}
