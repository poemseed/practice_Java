package b_question;

import java.util.Scanner;

public class B2739 {
	public static void main(String[] args) {
		// N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int result = 0;
		
		for( int i = 1; i < 10; i++ ) {
			result = num*i;
			System.out.println( num + " * " + i + " = " + result );
		}
		
		
		scan.close();
		
		
		
		
	}

}
