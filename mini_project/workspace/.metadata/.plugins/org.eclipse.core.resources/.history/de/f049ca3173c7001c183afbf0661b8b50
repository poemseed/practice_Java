package hogwarts_game;

import java.util.Scanner;

public class Hogwarts_main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Gryffindor g_assign = new Gryffindor("그리핀도르");
		Slytherin s_assign = new Slytherin("슬리데린");
		Ravenclaw r_assign = new Ravenclaw("래번클로");
		Hufflepuff h_assign = new Hufflepuff("후플푸프");
		Delay delay = new Delay();
		
		// 문제와 보기
		String q1 = "Q. 다음 단어 중 사람들이 당신을 묘사할 때 가장 마음에 들지 않는 것은?";
		String a1 = "1.평범한	\n2.무식한		\n3.비겁한		\n4.이기적인";
		String q2 = "Q. 당신에게 어떤 능력이 주어진다면 무엇을 고르겠는가?";
		String a2 = "1.마음을 읽는 능력	\n2.투명해지는 능력	\n3.초인적인 힘의 능력	\n4.동물과 대화하는 능력";
		String q3 = "Q. 당신은 다음 중 어떤 사람이고 싶은가?";
		String a3 = "1.모방의 대상	\n2.신뢰의 대상	\n3.칭찬의 대상	\n4.두려움의 대상";
		String q4 = "Q. 당신은 머글과 마주쳤고 그 머글은 당신이 마법사임을 확신한다고 말한다. 이때 당신은,";
		String a4 = "1.왜 그렇게 생각하냐고 묻는다.	\n2.긍정한다. 그리고 저주 마법을 맞아보고 싶은지 묻는다.	"
				+ "\n3.긍정하며 가버린다. 그래서 당신이 허세를 부리는 건지 진짜 마법사인지 헷갈리게 만든다.	\n4.정신에 문제가 있는게 아닌지  걱정된다고 하며 의사를 찾아가 볼 것을 권한다.";
		String q5 = "Q. 역사에 어떻게 알려지고 싶은가?";
		String a5 = "1.현명한 사람	\n2.선한 사람	\n3.위대한 사람	\n4.용감한 사람";
		String q6 = "Q. 당신이 마법 정원에 들어간다면 가장 먼저 살펴보고 싶은 것은?";
		String a6 = "1.은색 나뭇잎이 달려있고 황금 사과가 열려있는 나무		\n2.서로 이야기하는 것처럼 보이는 통통한 빨간 독버섯들"
				+ "\n3.깊은 곳에서 반짝이는 뭔가가 소용돌이치고 있는, 거품이 있는 웅덩이	\n4.이상할 정도로 반짝거리는 눈을 가진 늙은 마법사의 조각상 ";
		
		// 추가문제들
		String exQ1 = "Q. 다음 중 가장 연구하고 싶은 것은?";
		String exA1 = "1.켄타로우스	\n2.인어	\n3.유령	\n4.트롤";
		String exQ2 = "Q. 당신이 가장 듣기 좋아하는 악기는?";
		String exA2 = "1.바이올린	\n2.트럼펫		\n3.피아노		\n4.드럼";
		String exQ3 = "Q. 만약 당신이 호그와트에 다닌다면, 어떤 동물을 데려갈 것인가?";
		String exA3 = "1.고양이	\n2.두꺼비		\n3.부엉이		\n4.쥐";
		String exQ4 = "Q. 기회가 주어진다면, 당신은 어떤 물약을 발명하겠는가?";
		String exA4 = "1.영광	\n2.사랑 	\n3.힘	\n4.지혜";
		String exQ5 = "Q. 호그와트에서 가장 배우고 싶은 것은?";
		String exA5 = "1.순간이동	\n2.변신술	\n3.비행술	\n4.신비한 동물 돌보기";
		String exQ6 = "Q. 늦은 밤 당신은 혼자 거리를 걷다가 이상한 울음소리를 들었고 그 울음소리가 마력을 가지고 있다고 생각했다. 이때 당신은?";
		String exA6 = "1.지팡이를 꺼내들고 그 자리에 멈춘다.\n2.어떤 일이 일어날 때까지 그림자 속에 몸을 숨기고, 사건이 발생되면 사용할 가장 적절한 방어 마법과 공격 마법을 속으로 생각한다."
				+ "\n3.지팡이를 휘둘러 울음소리의 원인을 찾는다.\n4.숨겨둔 지팡이를 한손에 쥐고, 무슨 일이 일어날 것을 대비해 주의를 계속 기울이며 가던 길을 간다.";
		String exQ7 = "Q. 당신이 가장 견디기 힘든 것은?";
		String exA7 = "1.배고픔	\n2.외로움	\n3.지루함	\n4.무시당함";
		String exQ8 = "Q.  당신과 당신의 친구 두 명은 트롤이 지키는 다리를 건너야 한다. 트롤은 이 중 한사람이 자신이 싸워야지만 세 명 모두 다리를 지나갈 수 있다고 말한다, 이때 당신은?";
		String exA8 = "1. 트롤과 싸우지 않고 세 명이 모두 지나갈 수 있도록 트롤을 혼란스럽게 만들려고 시도한다.	\n2.누가 싸울 지 제비뽑기로 결정할 것을 제안한다."
				+ "\n3.(트롤에게는 비밀로 하고) 셋 모두 싸울 것을 제안한다.		\n4.당신이 싸우겠다고 자원한다.";

		// 질문과 보기를 배열에 넣기
		String[][] arrQNA = {
				{q1, a1},
				{q2, a2},
				{q3, a3},
				{q4, a4},
				{q5, a5},
				{q6, a6}
		};
		
		// 사용자 대답
		String userName;	
		int userAnswer;
		
		// 기숙사별 점수쌓이는 곳
		int gryffindor = 0, slytherin = 0, ravenclaw = 0, hufflepuff = 0;
		
		/*
		 * 테스트 시작
		 * 이름 입력받기
		 */
		System.out.println("당신의 이름을 한글로 입력해주세요.");
		
		// 이름이 한글인지 검사하기
		while(true) {
			userName = scanner.next();
			if( !RegexHelper.getInstance().isKor(userName) ) {	
				System.out.println("이름은 한글로 입력해 주세요.");
				continue;
			}else {
				break;
			}
		}
		
		// 스토리 시작
		System.out.println("평범한 토요일 오후, 창문 너머로 보이는 부엉이 한마리. 홀린듯 다가가니 손에 편지 한통을 건네줍니다.");
		delay.timeDelay(1500);
		System.out.println( userName + ">> 이게 뭐지? ");
		delay.timeDelay(1000);
		System.out.println("------------------------------------------------------------"
				+ "\n친애하는 " + userName + "님에게\n호그와트 마법학교에 입학이 허가되었음을 알립니다. 함께 동봉된 필요한 책과 장비 목록을 확인하세요.\n" + 
				"학기는 9월 1일에 시작되며, 부엉이를 통한 회신을 기다립니다.\n"
				+ "------------------------------------------------------------");
		delay.timeDelay(2500);
		System.out.println( "창가를 보니 부엉이는 여전히 그자리에서 당신을 바라보고 있습니다.");
		System.out.println("1. 간다고 회신한다. 2. 가지 않는다고 회신한다.");
		int startAnswer = scanner.nextInt();
		
		// 1. 간다고 회신한다.
		if( startAnswer == 1) {
			// 게임진행
			System.out.println("어느새 호그와트 마법학교에 도착해 기숙사 배정을 받게 되었어요. 다음 문항들을 읽고 마음에 드는 답을 고르세요."
					+ "\n 단, 한가지 숫자만 적으세요.( 예시. 1 )");
		
			// 문제와 보기 출제
			for( int i = 0; i < arrQNA.length; i++ ) {
				for( int j = 0; j < arrQNA[i].length; j++ ) {
					System.out.println( arrQNA[i][j] );
				}
				
				// 1~4까지의 숫자만 대답으로 받기
				while(true) {
					userAnswer = scanner.nextInt();
					
					if( !(userAnswer >= 1 && userAnswer <= 4) ) {	
						System.out.println("1~4까지의 숫자를 입력하세요.");
						continue;
					}else {
						break;
					}
				}
				
				// 점수 배분
				// 1번, 2번
				if( arrQNA[i][0] == arrQNA[0][0] || arrQNA[i][0] == arrQNA[1][0]) {
					if( userAnswer == 1 ) {
						slytherin++;
					}else if( userAnswer == 2 ) {
						ravenclaw++;
					}else if( userAnswer == 3 ) {
						gryffindor++;
					}else {
						hufflepuff++;
					}
				// 3번
				}else if( arrQNA[i][0] == arrQNA[2][0] ) {
					if( userAnswer == 1 ) {
						gryffindor++;
					}else if( userAnswer == 2) {
						hufflepuff++;
					}else if( userAnswer == 3) {
						ravenclaw++;
					}else {
						slytherin++;
					}
				// 4번
				}else if( arrQNA[i][0] == arrQNA[3][0] ) {
					if( userAnswer == 1 ) {
						hufflepuff++;
					}else if( userAnswer == 2) {
						slytherin++;
					}else if( userAnswer == 3) {
						ravenclaw++;
					}else {
						gryffindor++;
					}
				// 5, 6번
				}else {
					if( userAnswer == 1 ) {
						ravenclaw++;
					}else if( userAnswer == 2 ) {
						hufflepuff++;
					}else if( userAnswer == 3 ) {
						slytherin++;
					}else {
						gryffindor++;
					}
				}
				
			}
			
			/*
			 * 결과
			 */
			// 하나의 기숙사가 점수가 높을때
			if( gryffindor > slytherin && gryffindor > ravenclaw && gryffindor > hufflepuff ||
				slytherin > gryffindor && slytherin > ravenclaw && slytherin > hufflepuff ||
				ravenclaw > gryffindor && ravenclaw > slytherin && ravenclaw > hufflepuff ||
				hufflepuff > gryffindor && hufflepuff > slytherin && hufflepuff > ravenclaw ) {
				
				// 결과발표시간조절
				delay.timeDelay(500, ".");
				delay.timeDelay(500, ".");
				delay.timeDelay(500, ".");
				
				// 결과
				if( gryffindor > slytherin && gryffindor > ravenclaw && gryffindor > hufflepuff ) {
					g_assign.result( userName );
				}else if( slytherin > gryffindor && slytherin > ravenclaw && slytherin > hufflepuff ){
					s_assign.result( userName );
				}else if( ravenclaw > gryffindor && ravenclaw > slytherin && ravenclaw > hufflepuff ) {
					r_assign.result( userName );
				}else {
					h_assign.result( userName );
				}	
			// 동점처리하기 
			// 두개의 기숙사가 동점일때----------------------------------------------------------------------------------------------
			}else if( gryffindor == slytherin && gryffindor > ravenclaw && gryffindor > hufflepuff ||
					gryffindor == ravenclaw && gryffindor > slytherin && gryffindor > hufflepuff || 
					gryffindor == hufflepuff && gryffindor > slytherin && gryffindor > ravenclaw ||
					slytherin == ravenclaw && slytherin > gryffindor && slytherin > hufflepuff || 
					slytherin == hufflepuff && slytherin > gryffindor && slytherin > ravenclaw ||
					ravenclaw == hufflepuff && ravenclaw > gryffindor && ravenclaw > slytherin) {
				
				// 그리핀도르와 다른 기숙사가 동점일때
				if( gryffindor == slytherin && gryffindor > ravenclaw && gryffindor > hufflepuff ||
						gryffindor == ravenclaw && gryffindor > slytherin && gryffindor > hufflepuff || 
						gryffindor == hufflepuff && gryffindor > slytherin && gryffindor > ravenclaw  ) {
					// 추가문제
					System.out.println(exQ1);
					System.out.println(exA1);
					
					// 1~4까지의 숫자만 대답으로 받기
					while(true) {
						userAnswer = scanner.nextInt();
						
						if( !(userAnswer >= 1 && userAnswer <= 4) ) {	
							System.out.println("1~4까지의 숫자를 입력하세요.");
							continue;
						}else {
							break;
						}
					}
					
					// 결과발표시간조절
					delay.timeDelay(500, ".");
					delay.timeDelay(500, ".");
					delay.timeDelay(500, ".");

					// 결과
					if( userAnswer == 1 || userAnswer == 2) {
						gryffindor++;
						g_assign.result( userName );
					}else {
						if( gryffindor == slytherin ) {
							slytherin++;
							s_assign.result( userName );
						}else if( gryffindor == ravenclaw ) {
							ravenclaw++;
							r_assign.result( userName );
						}else {
							hufflepuff++;
							h_assign.result( userName );
						}
					}
					// 그리핀도르와 동점 끝
					
				// 슬리데린과 다른 기숙사 동점일때 
				}else if( slytherin == ravenclaw && slytherin > gryffindor && slytherin > hufflepuff || 
						slytherin == hufflepuff && slytherin > gryffindor && slytherin > ravenclaw ) {
					// 추가문제
					System.out.println(exQ2);
					System.out.println(exA2);
					
					// 1~4까지의 숫자만 대답으로 받기
					while(true) {
						userAnswer = scanner.nextInt();
						
						if( !(userAnswer >= 1 && userAnswer <= 4) ) {	
							System.out.println("1~4까지의 숫자를 입력하세요.");
							continue;
						}else {
							break;
						}
					}
					// 결과발표시간조절
					delay.timeDelay(500, ".");
					delay.timeDelay(500, ".");
					delay.timeDelay(500, ".");

					// 결과
					if( userAnswer == 1 || userAnswer == 2) {
						slytherin++;
						s_assign.result( userName );
					}else {
						if( slytherin == ravenclaw ) {
							ravenclaw++;
							r_assign.result( userName );
						}else {
							hufflepuff++;
							h_assign.result( userName );
						}
					}
					// 슬리데린과 동점 끝
					
				// 래번클로와 후플푸프 동점일때
				}else {
					// 추가 문제
					System.out.println(exQ3);
					System.out.println(exA3);
					
					// 1~4까지의 숫자만 대답으로 받기
					while(true) {
						userAnswer = scanner.nextInt();
						
						if( !(userAnswer >= 1 && userAnswer <= 4) ) {	
							System.out.println("1~4까지의 숫자를 입력하세요.");
							continue;
						}else {
							break;
						}
					}
					
					// 결과발표시간조절
					delay.timeDelay(500, ".");
					delay.timeDelay(500, ".");
					delay.timeDelay(500, ".");
					
					// 결과
					if( userAnswer == 1 || userAnswer == 2 ) {
						ravenclaw++;
						r_assign.result( userName );
					}else {
						hufflepuff++;
						h_assign.result( userName );
					}
			
				}
			// 두 기숙사가 동점일때 끝
				
			// 세 기숙사가 동점일때 ----------------------------------------------------------------------------------
			}else if( gryffindor == slytherin && gryffindor == ravenclaw && gryffindor > hufflepuff ||
					gryffindor == slytherin && gryffindor == hufflepuff && gryffindor > ravenclaw || 
					gryffindor == ravenclaw && gryffindor == hufflepuff && gryffindor > slytherin ||
					slytherin == ravenclaw && slytherin == hufflepuff && slytherin > gryffindor ) {
				// 그리핀도르 기준 (그리핀도르 = 슬리데린 = 래번클로), (그리핀도르 = 슬리데린 = 후플푸프), (그리핀도르 = 래번클로 = 후플푸프)일 경우
				if( gryffindor == slytherin && gryffindor == ravenclaw ) {
					// 추가문제
					System.out.println(exQ4);
					System.out.println(exA4);
					
					// 1~4까지의 숫자만 대답으로 받기
					while(true) {
						userAnswer = scanner.nextInt();
						
						if( !(userAnswer >= 1 && userAnswer <= 4) ) {	
							System.out.println("1~4까지의 숫자를 입력하세요.");
							continue;
						}else {
							break;
						}
					}
					
					// 결과발표시간조절
					delay.timeDelay(500, ".");
					delay.timeDelay(500, ".");
					delay.timeDelay(500, ".");
					
					// 결과
					if( userAnswer == 1 || userAnswer == 3 ) {
						slytherin++;
						s_assign.result( userName );
					}else if( userAnswer == 2  ) {
						gryffindor++;
						g_assign.result( userName );
					}else {
						ravenclaw++;
						r_assign.result( userName );
					}
				}else if( gryffindor == slytherin && gryffindor == hufflepuff ) {
					// 추가문제
					System.out.println(exQ5);
					System.out.println(exA5);
					
					// 1~4까지의 숫자만 대답으로 받기
					while(true) {
						userAnswer = scanner.nextInt();
						
						if( !(userAnswer >= 1 && userAnswer <= 4) ) {	
							System.out.println("1~4까지의 숫자를 입력하세요.");
							continue;
						}else {
							break;
						}
					}
					
					// 결과발표시간조절
					delay.timeDelay(500, ".");
					delay.timeDelay(500, ".");
					delay.timeDelay(500, ".");
					
					// 결과
					if( userAnswer == 1 ) {
						slytherin++;
						s_assign.result( userName );
					}else if( userAnswer == 2 || userAnswer == 3 ) {
						gryffindor++;
						g_assign.result( userName );
					}else {
						hufflepuff++;
						h_assign.result( userName );
					}
				}else if( gryffindor == ravenclaw && gryffindor == hufflepuff ) {
					System.out.println(exQ6);
					System.out.println(exA6);
					
					// 1~4까지의 숫자만 대답으로 받기
					while(true) {
						userAnswer = scanner.nextInt();
						
						if( !(userAnswer >= 1 && userAnswer <= 4) ) {	
							System.out.println("1~4까지의 숫자를 입력하세요.");
							continue;
						}else {
							break;
						}
					}
					
					// 결과발표시간조절
					delay.timeDelay(500, ".");
					delay.timeDelay(500, ".");
					delay.timeDelay(500, ".");
					
					// 결과
					if( userAnswer == 1 ) {
						hufflepuff++;
						h_assign.result(userName);
					}else if( userAnswer == 2 || userAnswer == 4 ) {
						ravenclaw++;
						r_assign.result(userName);
					}else {
						gryffindor++;
						g_assign.result(userName);
					}
				// (슬리데린 = 래번클로 = 후플푸프)
				}else {
					System.out.println(exQ7);
					System.out.println(exA7);
					
					// 1~4까지의 숫자만 대답으로 받기
					while(true) {
						userAnswer = scanner.nextInt();
						
						if( !(userAnswer >= 1 && userAnswer <= 4) ) {	
							System.out.println("1~4까지의 숫자를 입력하세요.");
							continue;
						}else {
							break;
						}
					}
					
					// 결과발표시간조절
					delay.timeDelay(500, ".");
					delay.timeDelay(500, ".");
					delay.timeDelay(500, ".");
					
					// 결과
					if( userAnswer == 1 || userAnswer == 2 ) {
						hufflepuff++;
						h_assign.result( userName );
					}else if( userAnswer == 3 ) {
						ravenclaw++;
						r_assign.result( userName );
					}else {
						slytherin++;
						s_assign.result( userName );
					}
				}
				// 세 기숙사가 동점일때 끝
				
			// 모든 기숙사가 동점일때 ----------------------------------------------------------------------------------
			}else{
				System.out.println(exQ8);
				System.out.println(exA8);
				
				// 1~4까지의 숫자만 대답으로 받기
				while(true) {
					userAnswer = scanner.nextInt();
					
					if( !(userAnswer >= 1 && userAnswer <= 4) ) {	
						System.out.println("1~4까지의 숫자를 입력하세요.");
						continue;
					}else {
						break;
					}
				}
				
				// 결과발표시간조절
				delay.timeDelay(500, ".");
				delay.timeDelay(500, ".");
				delay.timeDelay(500, ".");
				
				// 결과
				if( userAnswer == 1 ) {
					ravenclaw++;
					r_assign.result( userName );
				}else if( userAnswer == 2 ){
					slytherin++;
					s_assign.result( userName );
				}else if( userAnswer == 3 ) {
					hufflepuff++;
					h_assign.result( userName );
				}else {
					gryffindor++;
					g_assign.result( userName );
				}
			}
			
//			System.out.println( "그리핀도르" + gryffindor);
//			System.out.println( "슬리데린" + slytherin);
//			System.out.println( "래번클로" + ravenclaw);
//			System.out.println( "후플푸프" + hufflepuff);
		
		// 2. 가지 않는다고 회신한다.	
		}else {
			delay.timeDelay(1000, "           \\        /\n            Game End\n           /        \\");
			System.out.println( userName + "님은 훌륭한 마법사가 될수 있었을텐데..안타깝군요.");
		}
		
		scanner.close();
		
	}

}
