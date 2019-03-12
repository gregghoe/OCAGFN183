package haupt;

public class Eisbaer extends Tier implements IRaubtier
{
	boolean hunger = true;
	
	@Override
	public boolean fresse(IOpfertier opfer) 
	{
		if (hunger == true)
		{
			this.kampfschrei();
			opfer.schreie();
			opfer.stirb();
			System.out.println(this.getName()+ "Mampft");	
			hunger = false;
			return true;
			}
		else
		{
			System.out.println(this.getName()+ " sagt: bin nicht hungrig");
			return false;
		}
		
	}

	@Override
	public String kampfschrei() 
	{
		String x = "RAAAAAORRR";
		return x;
	}
	
	@Override
	public String getName() 
	{
		return "Robin";
	}

	@Override
	public int getLeben() 
	{
		return 666;
	}
	
	@Override
	public boolean lebendig() 
	{
		if (this.getLeben()> 0)
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
		System.out.println("Au.... =(");
	}
}
