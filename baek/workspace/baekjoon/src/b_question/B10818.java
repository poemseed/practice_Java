package b_question;

import java.util.Scanner;

public class B10818 {

	public static void main(String[] args) {
		// N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
		// 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
		// 입력
		// 5
		// 20 10 35 30 7
		// 출력
		// 7 35
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		// for문을 통해 배열에 값 저장
		for( int i = 0; i < n; i++ ) {
			int num = scan.nextInt();
			arr[i] = num;
		}
		// for문을 따로 돌리지 않고 Arrays.sort(배열명);을 이용하여 배열을 정렬하여 최대값과 최소값을 구할수 있다.
		// 최소값은 배열의 첫번째 요소가 되고 최대값은 배열의 마지막 요소가 된다.
		// arr[0] -> 최소값
		// arr[arr.length-1] -> 최대값
		
		
		// 최대값과 최소값을 얻기 위해 비교할 배열값 변수에 할당
		int max = arr[0], min = arr[0];
		
		for( int i = 0; i < arr.length; i++ ) {
			// 최대값
			if( max < arr[i]) {
				max = arr[i];
			}
			// 최소값
			if( min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println(min + " " + max);
		
		scan.close();
		
		
		
	}

}
