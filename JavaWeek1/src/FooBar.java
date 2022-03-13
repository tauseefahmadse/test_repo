
public class FooBar {
		public static void main(String args[])
		{
			int i ;
			for (i=1; i<=100; i++)
			{
				if(i%3 == 0 && i%5 == 0)
				{
					System.out.println("FooBar");
				} 
				else if(i%3 == 0)
				{
					System.out.println("Foo");
				}
				else if(i%5 == 0)
				{
					System.out.println("Bar");
				}
				else {
					System.out.println(i);
				}
				
			}
		}
}
