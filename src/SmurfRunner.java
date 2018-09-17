
public class SmurfRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
		Smurf handy = new Smurf("Handy");
		handy.eat();
		System.out.println(handy.getName());
		
		// * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
		Smurf papa = new Smurf("Papa");
		System.out.println(papa.getName());	
		System.out.println("My hat is " + papa.getHatColor()+ ".");
		System.out.println("I'm a " + papa.isGirlOrBoy()+ ".");
		
		// * 6. Make a Smurfette and print her name, hat color and girl or boy. 
		Smurf smurfette = new Smurf("Smurfette");
		System.out.println(smurfette.getName());	
		System.out.println("My hat is " + smurfette.getHatColor()+ ".");
		System.out.println("I'm a " + smurfette.isGirlOrBoy()+ ".");

	}

}
