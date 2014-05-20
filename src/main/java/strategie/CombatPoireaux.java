package strategie;

import java.util.Random;

public class CombatPoireaux implements Combat {
	private Random random = new Random();

	@Override
	public int seBattre() {
		return random.nextInt(2);
	}
}
