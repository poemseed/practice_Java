package hogwarts_game;

// 배정완료
public class Assign {
	private String dormName;
	
	public Assign(String dormName) {
		super();
		this.dormName = dormName;
	}
	
	public String getDormName() {
		return dormName;
	}

	public void setDormName(String dormName) {
		this.dormName = dormName;
	}

	// 기숙사 배정 공통 문구
		public void result( String userName) {
			System.out.println( userName + "님은 " + dormName + "에 배정되었습니다." );
			
		}
	
	
	
}
