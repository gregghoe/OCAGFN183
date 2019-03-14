package geometrie;

public abstract class Ding2D
{
	protected double x;
	protected double A;
	protected double U;
	
	public Ding2D() 
	{
		validate();
	}
	
	public double getX()
	{
		return this.x;
	}
	public  void setX(double x)
	{
		this.x = x;
		this.validate();
	}	
	
	public abstract double validate();
	
	
	public double getA()
	{
		return A;
	}
	public double getU()
	{
		return U;
	}
	
	
}
