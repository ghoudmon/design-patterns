package strategie;

import java.util.Random;

public class SoinPlante implements Soin {
	
	private Random random = new Random();
	
	@Override
	public int seSoigner() {
		return random.nextInt(6);
	}
}
