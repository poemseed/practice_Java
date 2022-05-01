package b_question;

import java.util.Scanner;

public class B2588 {

	public static void main(String[] args) {
		// (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
		// (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		String num2 = scan.next();
		
		String numGetL = num2.substring(2);
		String numGetM = num2.substring(1, 2);
		String numGetF = num2.substring(0, 1);
		
		int numL = Integer.parseInt(numGetL); 
		int numM = Integer.parseInt(numGetM); 
		int numF = Integer.parseInt(numGetF);
		int numFML = Integer.parseInt(num2);
		
		System.out.println(num1*numL);
		System.out.println(num1*numM);
		System.out.println(num1*numF);
		System.out.println(num1*numFML);
		
		scan.close();
		
		
	}

}
