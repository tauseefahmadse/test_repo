class Employee{
	 private int salary;
	 Employee(){
		 
	 }
	 Employee(int sal){
		 this.salary= sal;
	 }
	public void setSalary(int sal) {
		this.salary= sal;
	}
	public int getSalary() {
		return salary;
	}
	
}
class Programmer extends Employee{
	
	Programmer() {
	}

	int bonus= 2000;
	
	public static void main(String[] args) {
	
		Programmer pro = new Programmer();
		pro.setSalary(20000);
		int total= pro.getSalary()+pro.bonus;
System.out.println("Programmer salary is "+ total);
	}
}
