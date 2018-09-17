

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
		RaceCar f1 = new RaceCar("Renault", 5);
		
		// 2. Print the RaceCar's position in the race
		System.out.println("Tu es en position " + f1.getPositionInRace());

		// 3. Crash the RaceCar
		f1.crash();
		
		// 4. If the car is damaged. Bring it in for a pit stop.
		if (f1.isDamaged())
			f1.pit();

		// 5. Help the car move into first place.
		f1.overtake();
		f1.overtake();
		f1.overtake();
		f1.overtake();
	}
}
