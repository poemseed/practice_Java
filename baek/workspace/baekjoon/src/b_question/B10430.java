package b_question;

import java.util.Scanner;

public class B10430 {

	public static void main(String[] args) {
		// (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
		// (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
		// 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
		// 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
		Scanner scan = new Scanner(System.in);
		
		String q = scan.nextLine();
		String[] q1 = q.split(" ");
		int a=0 , b=0, c=0;
		
		for(int i = 0; i < q1.length; i++ ) {
			if(q1[i] == q1[0]) {
				a = Integer.parseInt(q1[i]);
			}else if(q1[i] == q1[1]) {
				b = Integer.parseInt(q1[i]);
			}else {
				c = Integer.parseInt(q1[i]);
			}
		}
		System.out.println("(A+B)%C = " + (a+b)%c );
		System.out.println("((A%C) + (B%C))%C = " + ((a%c) + (b%c))%c );
		System.out.println("(A×B)%C = " + (a*b)%c );
		System.out.println("((A%C) × (B%C))%C = " + ((a%c) * (b%c))%c );
		
		scan.close();
		
	}

}
