package other_question;

public class Apples {

	public static void main(String[] args) {
		// 사과를 담는데 필요한 바구니 수 
		// 13개가 필요하다
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = numOfApples/sizeOfBucket + 1 ;
		
		System.out.println("필요한 바구니의 수 : " + numOfBucket);
		
		// 삼항연산자 사용
		// num 값에 따라 양수, 음수, 0을 출력하는 코드
		int num = 0;
		System.out.println(  (num >= 0) ? ((num == 0) ? 0 : "양수" ) : "음수" );
		
		
		
		
	}

}
