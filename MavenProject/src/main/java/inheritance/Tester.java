package inheritance;

public class Tester extends Employee{
	public void display()
	{
	System.out.println("My project");
	}
	

	public static void main(String[] args) {
		Developer d=new Developer();
		Tester t=new Tester();
		d.salary();
		t.salary();
		d.project();
		t.display();

	}

}
