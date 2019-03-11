package haupt;

public class Loewe extends Tier implements IRaubtier
{
	private int staerke=0;
	
	public Loewe(int staerke)
	{
		this.staerke=staerke;
	}
	

	public int getStaerke()
	{
		return staerke;
	}
	public void setStaerke(int staerke)
	{
		this.staerke = staerke;
	}

	@Override
	public boolean fresse(IOpfertier opfer)
	{
		if(opfer.getLeben()<this.staerke)
		{
			opfer.setLeben(getLeben());
		}
		return false;
	}

	@Override
	public String kampfschrei()
	{
		String ruf = "Ich heise " + this.getName()
				+ ". Fauch ich bin ein Löwe.";
		return ruf;
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
		System.out.println(this.getName()+" hurra... ich lebe noch, mein Leben beträgt:" + 
							this.getLeben());
		return true;
	}

	@Override
	public void aua()
	{
		System.out.println("Aua, hee wer beist mich da???");

	}

}
