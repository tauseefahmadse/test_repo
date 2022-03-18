//main class for Sandwhich.java
public class OverloadedContructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sandwhich sandwhich = new Sandwhich();
		//Sandwhich sandwhich = new Sandwhich("plain");
		//Sandwhich sandwhich = new Sandwhich("plain","tomato");
		System.out.println(sandwhich.bread);
		System.out.println(sandwhich.topping);
	}

}
