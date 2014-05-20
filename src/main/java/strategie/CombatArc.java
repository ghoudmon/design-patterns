package strategie;

import java.util.Random;

public class CombatArc implements Combat {
	private Random random = new Random();

	@Override
	public int combattre() {
		return random.nextInt(5);
	}
}
