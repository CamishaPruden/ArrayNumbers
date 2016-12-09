import java.util.Scanner;

/**
 * 
 */

/**
 * @author c.pruden
 *
 */
public class ArrayNumbersCoding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		
		int maximum;
		int[] Values = new int[5];
		
		for(int i = 0; i < Values.length; i++){
			System.out.print("Please enter a integer: ");
			Values[i] = userInput.nextInt();
		}
		
		maximum = Values[0];
		
		for(int i = 0; i < Values.length; i++){
			if(Values[i]>maximum){
				maximum = Values[i];
			}
		}
		
		System.out.println("The maximum is " + maximum);
		
		userInput.close();
	}

}
