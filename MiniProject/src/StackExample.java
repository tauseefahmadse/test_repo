import java.util.Stack;

public class StackExample {

	static public void main(String args [] ) {
		// LIFO (Last in first out)
		Stack<String> colors = new Stack<>();
		colors.push("Red");
		colors.push("Green");
		colors.push("Blue");
		colors.push("Orange");
		colors.push("Yellow");	
		colors.push("SkyBlue");
		
		System.out.println(colors);
		colors.pop();
		System.out.println(colors);
		System.out.println(colors.size());
		System.out.println(colors.peek());
		int location = colors.search("Red");
		System.out.println(location);
		
		System.out.println(colors.empty());
		colors.pop();
		colors.pop();
		colors.pop();
		System.out.println(colors.empty());
	}

}
