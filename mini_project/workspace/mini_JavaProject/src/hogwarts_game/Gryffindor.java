package hogwarts_game;

public class Gryffindor extends Assign {

	public Gryffindor(String dormName) {
		super(dormName);
	}

	@Override
	public void result( String userName ) {
		super.result(userName);
		System.out.println( super.getDormName() + "는 용기 있고 대담한 이들을 위한 기숙사로,‘이름에 걸맞은 용기를 보여주는 아이들은 누구나 다 가르치겠다’는 "
				+ "이념을 가지고 창립했습니다.\n"+ super.getDormName() +"의 상징은 동물 중에서 가장 위대한 사자이며, 색은 진홍색과 금색입니다. 기숙사 휴게실은 "
				+ super.getDormName() + " 탑에 있습니다. \n호그와트에서 가장 용감하고 대담한 사람들이 모인 곳의 멤버가 된 것을 축하합니다.");
	}

	

}
