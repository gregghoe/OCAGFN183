package haupt;

public class Wolf extends Tier implements IRaubtier
{

	@Override
	public String getName()
	{
	    
		return null;
	}

	@Override
	public int getLeben()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean lebendig()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void aua()
	{
		
		String aua = "Auaaaaaa es tut weh";

	}

	@Override
	public boolean fresse(IOpfertier opfer)
	{
		
		return false;
	}

	@Override
	public String kampfschrei()
	{
		String hello ="uaaaaaaaahhhhh";
		return hello;
	}

	@Override
	public void setLeben(int i)
	{
		// TODO Auto-generated method stub
		
	}

}
