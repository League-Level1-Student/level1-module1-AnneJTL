
public class Duck {

	private int numberOfFriends;
	private String favoriteFood;
	
	Duck(String favoriteFood, int numberOfFriends) {
      	this.favoriteFood = favoriteFood;
      	this.numberOfFriends = numberOfFriends;
	}
	
	public void quack() {
		System.out.println("Ducks quack to obtain " + favoriteFood + ".");		
	}
	
	public void waddle() {
		System.out.println("Ducks waddle with there " + numberOfFriends + " best friends.");		

	}
	

}
