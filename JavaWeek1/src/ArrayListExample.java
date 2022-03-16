import java.util.ArrayList;
public class ArrayListExample {
	public static void main (String[] args)
	{
		ArrayList <String> name = new ArrayList<String>();
		name.add("Reeha");
		name.add("Aman");
		name.add("Zoi");
		name.add("Adii");
		//name.remove(3);
		//name.clear();
		name.set(3, "Hano");
		System.out.println(name.size());
		
		for (int i=0; i<name.size();i++)
		{
			System.out.println(name.get(i));
		}	
	}
}
