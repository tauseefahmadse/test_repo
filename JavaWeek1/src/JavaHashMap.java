import java.util.HashMap;
public class JavaHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> countries = new HashMap<String,String>();
		countries.put("USA", "Washington DC");
		countries.put("Russia","Moscow");
		countries.put("India", "New Dehli");
		countries.put("China","Kabul");
		
		//countries.remove("USA");
		//countries.clear();
		//countries.size();
		//countries.replace("Pakistan", "Karachi");
		//System.out.println(countries.size());
		System.out.println(countries);
		//System.out.println(countries.containsKey("India"));
		System.out.println(countries.keySet());
		System.out.println(countries.get("USA"));
		
		for(String i : countries.keySet()){
			System.out.print(i + "\t" + "= ");
			System.out.println(countries.get(i));
		}
	}

}
