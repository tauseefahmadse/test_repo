import java.util.Scanner;
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int table=5;
		System.out.println("Which Table you want to print: ");
		Scanner scanner = new Scanner(System.in);
		int table = Integer.parseInt(scanner.nextLine());
		System.out.println("The Table of :"+ table);
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(table+" * "+i+" = "+ table*i);
		}
	}

}
