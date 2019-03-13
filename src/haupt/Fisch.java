package haupt;

public class Fisch extends Tier implements IOpfertier
{
	
	private String name;
	private int leben;
	
	public Fisch(String name, int leben)
	{
		this.name = "Nemo";
		this.leben = 10;
	}

	@Override
	public String getName()
	{
		return this.name;
	}

	@Override
	public int getLeben()
	{
		return this.leben;
	}

	@Override
	public boolean lebendig()
	{
		if (this.leben>0)
		{
			return true;
		} else {
			return false;}
	}

	@Override
	public void aua()
	{
		System.out.println(this.getName() + ": Das tut weh!");
		

	}

	@Override
	public void schreie()
	{
		System.out.println(this.name + ": Blubb Blubb");
		
	}

	@Override
	public void stirb()
	{
		this.leben = 0;
		System.out.println(" Der Fisch wurde gefressen!");
		
	}

}
