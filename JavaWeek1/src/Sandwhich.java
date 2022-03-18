//Sandwhich class for OverloadedConstructor.java
public class Sandwhich {
	String bread;
	String topping;
	
	Sandwhich()
	{
		
	}
	
	Sandwhich(String bread)
	{
		this.bread= bread;
	}
	
	Sandwhich(String bread,String topping )
	{
		this.bread= bread;
		this.topping = topping;
	}
}
