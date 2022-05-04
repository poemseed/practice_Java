package b_question;

import java.util.Scanner;

public class B10952 {

	public static void main(String[] args) {
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		// 입력은 여러 개의 테스트 케이스로 이루어져 있다.
		// 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		// 입력의 마지막에는 0 두 개가 들어온다.
		Scanner scan = new Scanner(System.in);
		
		
		while( true ){
			String data = scan.nextLine();
			String[] dataArr = data.split(" ");
			
			int num1 = Integer.parseInt(dataArr[0]);
			int num2 = Integer.parseInt(dataArr[1]);
			
			if( num1 == 0 && num2 == 0 ) {
				break;
			}else {
			System.out.println(num1+num2);
			}
		}
		
		scan.close();
	}

}
