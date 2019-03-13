package haupt;
// COMMIT FORCE
public class Floh {
	
	private String name;

	public Floh(String name) {
		this.name = name;
	}
	public Floh() {
		this("#Floh#");
	}

	public void zeigDich()
	{
		System.out.println("Floh "+this.name + ": Ich h�pfe herum");
	}
	
	public String getName() { return name; }
}
