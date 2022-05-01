package b_question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
// import java.util.StringTokenizer;

public class B15552 {

	public static void main(String[] args) throws IOException  {
		// Java를 사용하고 있다면, Scanner와 System.out.println 대신 
		// BufferedReader와 BufferedWriter를 사용할 수 있다. BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
		// 입력
		// 5
		// 1 1
		// 12 34
		// 5 500
		// 40 60
		// 1000 1000
		// 출력
		// 2
		// 46
		// 505
		// 100
		// 2000
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++ ) {
			String answer = br.readLine();
			String [] arrNum = answer.split(" ");
			int num1 = Integer.parseInt(arrNum[0]);
			int num2 = Integer.parseInt(arrNum[1]);
			bw.write(num1+num2+"\n");	// +"\n" -> String타입으로 변형을 위해
		}
		
		bw.flush();	// 한번에 쏟아낸다
		
		/* split과 같은 것
		 * StringTokenizer st;
		 * st = new StringTokenizer(br.readLine()," ");
		 * int a = Integer.parseInt(st.nextToken());
		 * int b = Integer.parseInt(st.nextToken());
		 * .
		 * .
		 * .
		 */
		
	}

}
