package terning;

public class Dice {


	public int roll() {
		          
		return (int) Math.ceil(Math.random() * 6);	
	}
	
	// roll the die n times and print the values
	public void rollMultiple(int n) {
		for (int i=0; i<n; i++) {
			System.out.print(roll() + " ");
		}		
	}
}
