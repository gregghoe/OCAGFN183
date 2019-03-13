package haupt;

public class Fisch extends Tier implements IOpfertier
{
	private String 	name;
	private int 	leben = 1;
	
	
	
	@Override
	public String getName() {
		this.name = "Klaus der Fisch";
		return name;
	}

	@Override
	public int getLeben() 
	{
		return leben;
	}
	

	@Override
	public boolean lebendig() {
		if (this.leben > 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public void aua() 
	{
		System.out.println(this.name +" blubbt: bluuub =(");
	}

	@Override
	public void schreie() 
	{
		System.out.println(this.name+ " blubbt: Blub.... x.x");
	}

	@Override
	public void stirb() 
	{
		this.leben=0;
		System.out.println(this.getName() + "ist gestorben");
	}

	@Override
	public IOpfertier fortpflanze() 
	{
		return null;
	}
}
