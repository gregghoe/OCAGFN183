package haupt;

public class Eisbaer extends Tier implements IRaubtier
{
	
	@Override
	public boolean fresse(IOpfertier opfer) 
	{
		if (opfer.getLeben() > 0)
		{
			System.out.println("FUU");
			System.out.println(this.getName()+ "Mampft");
			opfer.setLeben(opfer.getLeben() -1);		
			return true;
			}
		else
		{
			System.out.println(this.getName()+ " sagt: Nope nix zu fressen da");
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
