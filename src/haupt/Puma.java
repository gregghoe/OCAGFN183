package haupt;

public class Puma extends Tier implements IRaubtier
{
    private String name;
    private int leben;
	public Puma(String name,int leben)
	{this.name=name;
	this.leben=leben;
	// test
		
	}
	@Override
	public boolean fresse(IOpfertier opfer)
	{
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String kampfschrei()
	{
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getName()
	{
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		
	}

}