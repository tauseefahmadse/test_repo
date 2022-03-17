
public class OverloadingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int z= add(1,3);
		int z= add(1,3,3);
		System.out.println(z);
	}
	static int add(int x, int y) 
	{
		return x+y;
	}
	static int add(int x, int y, int z) 
	{
		return x+y+z;
	}
}
