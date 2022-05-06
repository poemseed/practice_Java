package b_question;

import java.util.Scanner;

public class B10951 {

	public static void main(String[] args) {
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		// 입력은 여러 개의 테스트 케이스로 이루어져 있다.
		// 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. 
		// 각 테스트 케이스마다 A+B를 출력한다.
		
		Scanner scan = new Scanner(System.in);
		
//		while( true ) {
//			
//			String text =  scan.nextLine();
//			
//			String [] textArr = text.split(" ");
//			
//			int num1 = Integer.parseInt(textArr[0]);
//			int num2 = Integer.parseInt(textArr[1]);
//			
//			System.out.println(num1+num2);
//		}
		
		while (scan.hasNext()) { 
			int a = scan.nextInt(); 
			int b = scan.nextInt(); 
			System.out.println(a + b); 
			} 

		
		scan.close();
		
	}

}
