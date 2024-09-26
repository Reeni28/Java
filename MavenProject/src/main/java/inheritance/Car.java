package inheritance;

public class Car extends Vehicle{
	String name="BMW";
	public void display()
	{
	System.out.println("Car name:"+name);
	
}

	public static void main(String[] args) {
		Car c=new Car();
		c.show();
		c.display();

	}

}
