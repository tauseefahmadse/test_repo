import java.util.ArrayList;
public class TwoDArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<String>> homeGrocery= new ArrayList<ArrayList<String>>(); 
		
		ArrayList<String> food= new ArrayList<String>(); 
		food.add("Pizza");
		food.add("Sandwhich");
		food.add("Burger");
		
		ArrayList<String> drinks= new ArrayList<String>(); 
		drinks.add("Coke");
		drinks.add("Pepsi");
		drinks.add("Sprite");
		
		ArrayList<String> shopping= new ArrayList<String>(); 
		shopping.add("Sugar");
		shopping.add("Oil");
		shopping.add("Salt");
		
		homeGrocery.add(food);
		homeGrocery.add(drinks);
		homeGrocery.add(shopping);
		
		System.out.println(homeGrocery.size());
		
			System.out.println(homeGrocery);
		
	}

}
