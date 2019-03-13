package haupt;

public class Loewe extends Tier implements IRaubtier
{
	private int leben;
	private int staerke;
	private int lautstaerke;
	
	
	
	public Loewe(int leben, int staerke, int lautstaerke)
	{
		this.leben = leben;
		this.staerke = staerke;
		this.lautstaerke = lautstaerke;
	}
	public Loewe(int leben, int staerke)
	{
		this(leben,staerke,5);
		
	}
	public Loewe(int leben)
	{
		this(leben,9);
	}	
	public Loewe()
	{
		this(7);
	}
	
	public void setLeben(int leben)
	{
		this.leben = leben;
	}




	@Override
	public boolean fresse(IOpfertier opfer)
	{
		if(Math.random()>0.8)
		{
			opfer.schreie();
			opfer.stirb();
			System.out.println(this.getName()+" ich bin satt!!!");
		return true;
		}
		else
		{
			System.out.println("Mist es ist entkommen, ich habe noch Hunger");
		return false;
		}
	}

	@Override
	public String kampfschrei()
	{
		String ruf = "Ich heise " + this.getName()
				+ ". Fauch ich bin ein L�we.";
		return ruf;
	}

	@Override
	public String getName()	
	
	{return this.name;}

	@Override
	public int getLeben()
	
	{return this.leben;	}

	@Override
	public boolean lebendig()
	{
		System.out.println(this.getName()+" hurra... ich lebe noch, mein Leben betr�gt:" + 
							this.getLeben());
		return true;
	}

	@Override
	public void aua()
	{
		System.out.println("Aua, hee wer beist mich da???");

	}

}
