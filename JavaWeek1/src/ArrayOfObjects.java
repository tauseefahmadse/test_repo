// refrence class Food.java
public class ArrayOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Food[] cabin = new Food[3];
		
		Food food1 = new Food("Potato");
		Food food2 = new Food("Peas");
		Food food3 = new Food("Mutton");
		Food[] cabin = {food1,food2,food3};
		
		System.out.println(cabin[0].name);
		System.out.println(cabin[1].name);
		System.out.println(cabin[2].name);
	}

}
