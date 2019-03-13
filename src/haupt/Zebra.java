package haupt;

public class Zebra extends Tier implements IOpfertier
{
	///
	

	@Override
	public String getName()
	{		return this.getName();	}
	@Override
	public int getLeben()
	{		return this.getLeben();	}
	@Override
	public void setLeben(int i)
	{
		leben = i;
	
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
		this.setLeben(this.getLeben()-1);
		System.out.println(this.getName()+" Opfertier schreit AUA das tut weh...");
		
	}

	@Override
	public void schreie()
	{
		System.out.println(this.getName()+" Opfertier schreit ich habe noch:" + this.getLeben() +" Leben");
		
	}

	@Override
	public void stirb()
	{
		this.setLeben(0);	
		System.out.println(this.getName()+" Opfertier ich bin Tot meineLebenspunkt sind bei:" + this.getLeben() );
	}


	
	
	
}
