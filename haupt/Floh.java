package katzen;

public class Floh
{
	private String name;

	public Floh(String name)
	{
		super();
		this.name = name;
		System.out.println(this.name + ": Ich hÃ¼p rum");
	}

	public String getName()
	{
		return name;
	}

	public void zeigDich()
	{
		System.out.println(this.name + "Ich hÃ¼pfe herum");
		
	}
	
}
