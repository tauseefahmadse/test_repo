// constructor for JavaConstruct.java
public class Human {
	String firstName;
	String lastName;
	 Human(String fname, String lname){
		this.firstName=fname;
		this.lastName= lname;
	}
	 void eat()
	 {
		 System.out.println(this.firstName+" is Eating");
	 }
	 void drink()
	 {
		 System.out.println(this.firstName+ " is Drinking");
	 }
}
