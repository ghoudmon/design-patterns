package strategie;

import java.util.Random;

public class SoinAlcool implements Soin {
	
	private Random random = new Random();
	
	@Override
	public int soigner() {
		return random.nextInt(2);
	}
}
