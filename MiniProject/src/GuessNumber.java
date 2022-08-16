import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myNumber = (int)(Math.random()*100);
		Scanner sc = new Scanner(System.in);
		int userNumber=0;
		do {
			System.out.println("Guess my number(1-100): ");
			 userNumber = sc.nextInt();
			 
			if(userNumber == myNumber) {
				System.out.println("Correct, Jelly Good ");	
				break;
			}
			else if(userNumber > myNumber) {
				System.out.println("Too large ");	
			}
			else {
				System.out.println("Too Small ");	
			}
				
		}while(userNumber >= 0);
		System.out.println("Here is the Number: "+ myNumber);
		
	} 

}
