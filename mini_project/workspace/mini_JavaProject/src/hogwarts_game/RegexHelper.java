package hogwarts_game;

import java.util.regex.Pattern;

public class RegexHelper {
	//-------------------싱글톤 시작----------------------
	private static RegexHelper current;	// 객체 생성
	
	public static RegexHelper getInstance() {
		if( current == null ) {
			current = new RegexHelper();
		}
		return current;
	}
	
	public static void freeInstance() {	// 메모리에서 없애는 메서드
		current = null;
	}
	
	private RegexHelper() {	// 객체 생성 방지
		super();
	}
	
	//-------------------싱글톤 끝----------------------
	
	// 공백, null
	public boolean isValue (String str) {
		boolean result = false;
		
		if( str != null ) {	// null이 아닐 경우 if문을 탄다
			result = !str.trim().equals("");	// 앞뒤 공백을 trim()으로 제거하고 이퀄로 공백인지 체크
		}
		return result;
	}
	
	
	// 한글
	public boolean isKor (String str) {
		boolean result = false;
		
		if( isValue(str) ) {
			result = Pattern.matches("^[ㄱ-ㅎ가-힣]*$", str);
		}
		
		return result;
	}
	
	// 숫자
	public boolean isNum (String str) {
		boolean result = false;
		
		if( isValue(str) ) {
			result = Pattern.matches("^[0-9]*$", str);
		}
		
		return result;
	}
	
	
}
