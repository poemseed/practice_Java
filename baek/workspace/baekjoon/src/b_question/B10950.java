package b_question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B10950 {

	public static void main(String[] args) throws IOException {
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		// 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		// 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		// 입력
		// 5
		// 1 1
		// 2 3
		// 3 4
		// 9 8
		// 5 2
		// 출력
		// 2
		// 5
		// 7
		// 17
		// 7
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++ ) {
			st = new StringTokenizer(br.readLine(), " ");
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			bw.write(num1+num2+"\n");
		}
		bw.flush();
		
		
		
	}

}
