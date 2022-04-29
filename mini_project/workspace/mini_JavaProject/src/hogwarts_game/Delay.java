package hogwarts_game;

public class Delay {

	public void timeDelay( int seconds ) {
		try {
			Thread.sleep(seconds);
		}catch(InterruptedException e ) {
			e.getMessage();
		}
	}
	
	public void timeDelay( int seconds, String msg ) {
		try {
			System.out.println(msg);
			Thread.sleep(seconds);
		}catch(InterruptedException e ) {
			e.getMessage();
		}
	}
	
	
	
	
}
