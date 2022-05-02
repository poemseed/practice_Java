package b_question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//import java.util.Scanner;
import java.util.StringTokenizer;

public class B11021 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		// 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		// 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		// 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++ ) {
			st = new StringTokenizer(br.readLine(), " ");
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			int sum = num1+ num2;
			bw.write("Case #x: "+sum+"\n");
		}
		bw.flush();
		
//		Scanner sc = new Scanner(System.in);
//
//		int N = sc.nextInt();
//
//		for (int i = 1; i <= N; i++) {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			System.out.println("Case #" + i + ": " + (a + b));
//		}
//		sc.close();
	

		
	}

}
