
public class Horse {

	private int numberOfFriends;
	private String favoriteFood;
	
	Horse(String favoriteFood, int numberOfFriends) {
      	this.favoriteFood = favoriteFood;
      	this.numberOfFriends = numberOfFriends;
	}
	
	public void neigh() {
		System.out.println("The horses neigh to say hello to the " + numberOfFriends + " members of the horde.");
	}
	
	public void eat() {
		System.out.println("The horses eat " + favoriteFood + ".");
	}
	

}

