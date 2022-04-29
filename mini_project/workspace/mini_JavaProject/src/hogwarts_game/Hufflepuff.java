package hogwarts_game;

public class Hufflepuff extends Assign {

	public Hufflepuff(String dormName) {
		super(dormName);
	}

	@Override
	public void result( String userName ) {
		super.result(userName);
		System.out.println( super.getDormName() + "는 현명하고 사려 깊은 이들을 위한 기숙사로, ‘똑똑하고 지혜로운 아이들만 가르치겠다’라는 이념을 가지고 창립했습니다.\n"
				+ super.getDormName() +"의 상징은 오소리이며, 색은 노랑과 검정입니다. 기숙사 휴게실은 연회장 옆 1층에 있습니다. \n가장 친절하고 품위와 끈기가 있는 기숙사의 "
						+ "멤버가 된 것을 환영합니다.");
	}
	
}
