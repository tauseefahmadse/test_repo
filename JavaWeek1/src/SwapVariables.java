
public class SwapVariables {
	public static void main (String[] args) {
		int x= 5;
		int y= 10;
		int temp;
		temp= x;
		x=y;
		y=temp;
		System.out.println("The value of x is " + x);
		System.out.println("The value of y is " + y);
	}
}
