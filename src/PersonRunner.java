
public class PersonRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person superman = new Person();
		superman.setName("SuperMan");
		superman.setSuperPower("Super Strength");
		System.out.println(superman.toString());
		
		Person batman = new Person();
		batman.setName("Batman");
		batman.setSuperPower("Genius Intellect");
		System.out.println(batman.toString());

		Person hulk = new Person();
		hulk.setName("hulk");
		hulk.setSuperPower("Transformation");
		System.out.println(hulk.toString());

	}

}
