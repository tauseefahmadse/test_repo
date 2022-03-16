
public class TwoDArray {
	public static void main (String[] args)
	{
		String [][] list = {
							{"sugar", "milk","oil"},
							{"pepper","salt","sugar"},
							{"oil","sugar","pepper"}
						};
				
		
		for(int i=0; i<list.length; i++)
		{
			System.out.println();
			for (int j=0; j<list[i].length; j++)
			{
				System.out.print(list[i][j]+" ");
			}
		}
	}
}
