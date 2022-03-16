import java.util.Scanner;
public class JavaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your nick name: ");
		String name = scanner.nextLine();
		
		System.out.println("How old are you: ");
		int age = scanner.nextInt();
		
		scanner.nextLine();// pause escaping squence for third input
		System.out.println("What is your favorite sports");
		String sports = scanner.nextLine();
		
		System.out.println("Hello " + name);
		System.out.println("Your age is " + age + " Years");
		System.out.println("Your like " + sports);
	}

}
