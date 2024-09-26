package inheritance;

public class Puppy extends Dog{
	String name="Browniee";
	public void name()
	{
		System.out.println("Dog name "+name);
		
	}

	public static void main(String[] args) {
		Puppy p=new Puppy();
		p.run();
		p.species();
		p.name();

	}

}
