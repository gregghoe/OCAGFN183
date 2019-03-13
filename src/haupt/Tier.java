package haupt;

public abstract class Tier
{

	protected  int leben;
	String name;
	int staerke;
	
	public abstract String getName();
	public abstract int getLeben();
	public abstract void setLeben(int i);
	public abstract boolean lebendig();
	public abstract void aua();
	
}