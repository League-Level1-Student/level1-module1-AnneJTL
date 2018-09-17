
public class Person {
	private String name;
	private String superPower;
	
	public String getName() {
		return this.name;
	}
	
	public String getSuperPower() {
		return this.superPower;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setSuperPower(String superPower) {
		this.superPower = superPower;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (this.name + " has made " + this.superPower + " skills.");
	}
	
	
}
