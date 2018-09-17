
public class SeaCreatureRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. In a Runner class, make a SeaCreature called â€œSpongebobâ€�. Use the methods below to make him eat, and laugh.
		// 2. Make Patrick and Squidward and print their name, have them eat, and make them laugh.
		SeaCreature creature = new SeaCreature("Spongebob");
		creature.eat();
		creature.laugh();
		
		SeaCreature pat = new SeaCreature("Patrick");
		pat.eat();
		pat.laugh();
		
		SeaCreature bob = new SeaCreature("Squidward");
		bob.eat();
		bob.laugh();
	}

}
