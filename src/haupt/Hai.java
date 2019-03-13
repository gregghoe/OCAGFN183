package haupt;

public class Hai extends Tier implements IRaubtier
{
	private String name;
	private int leben;

	public Hai(String name, int Leben) {
		this.name = "Willy";
		this.leben = 10;
	}

	@Override
	public boolean fresse(IOpfertier opfer)
	{
		opfer.schreie();
		opfer.stirb();
		this.leben++;
		return true;
	}

	@Override
	public String kampfschrei()
	{
		return this.getName() + ": Ich bins der Hai. Hi!";
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
	public void setLeben(int i)
	{
		// TODO Auto-generated method stub
		
	}

}
