package b_question;

import java.util.Scanner;

public class B1330 {

	public static void main(String[] args) {
		// 숫자 A와 B를 입력받아 A가 크면 >출력, B가 크면 <출력, 같으면 ==출력
		Scanner scan = new Scanner(System.in);
		
		String answer = scan.nextLine();
		String sA = answer.substring(0, 1);
		String sB = answer.substring(2); 
		int A = Integer.parseInt(sA);
		int B = Integer.parseInt(sB);
		
		if( A > B ) {
			System.out.println(">");
		}else if( A < B) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
		
		
		scan.close();
		
	}

}
