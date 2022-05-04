package b_question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B10871 {

	public static void main(String[] args) throws IOException {
		// 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
		// 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
		// 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
		// 입력
		// 10 5
		// 1 10 4 9 2 3 8 5 7 6
		// 출력
		// 1 4 2 3
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		int[] num = new int [n];
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for( int i = 0; i < n; i++ ) {
			num[i] = Integer.parseInt(st.nextToken()); 
			
			if( num[i] < x ) {
				bw.write(num[i]+" ");
			}
		}
		
		bw.flush();
		
		
		
	}

}
