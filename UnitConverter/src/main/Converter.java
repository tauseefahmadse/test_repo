package main;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner scunit = new Scanner(System.in);  
		int menuSelection = 0;
		while(menuSelection!=4 ) {
			System.out.println("Please select an option:");
			System.out.println("1 Cups to Teaspoons");
			System.out.println("2 Miles to Kilometers");
			System.out.println("3 US Gallons to Imperial Gallons");
			System.out.println("4 Quit");
			
			 menuSelection=  sc.nextInt();
			double firstQuantity=  sc.nextDouble();
			double covertedQuantity= 0.0;
			
			
				
				switch (menuSelection) {
				case 1:
					covertedQuantity = firstQuantity * 48;
					break;
				case 2:
					covertedQuantity = firstQuantity * 1.60934;
					break;
				case 3:
					covertedQuantity = firstQuantity * 0.832674;
					break;
				case 4:
					System.out.println("You Quit");
					break;
					
				}	
				
			System.out.println(covertedQuantity);
			
		}
		
		
	}


}
