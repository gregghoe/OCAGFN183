package haupt;

import java.util.concurrent.ThreadLocalRandom;

public class Gazelle extends Tier implements IOpfertier {

	private String 	name;
	private int 	leben;
	
	public Gazelle() {
		this.name = "Rom";
		this.leben = 10;
	}
	@Override
	public void schreie() {
		String s ="";
		if(this.lebendig()) {
			s="Gazelle "+this.getName()+"(Leben="+this.getLeben()+"): �HHH!!!";
		} else {
			s="Gazelle tot";
		}
		System.out.println(s);

	}
	@Override
	public void stirb() {
		this.leben = 0;
		System.out.println("Gazelle tot");
	}
	@Override
	public boolean lebendig() {
		if (this.getLeben()>0) {return true;} 
		else {return false;}	
	}
	@Override
	public void aua() {
		System.out.print("Gazelle "+this.getName()+" Leben von "
				+this.getLeben()+" auf ");
		this.leben-=ThreadLocalRandom.current().nextInt(this.leben);
		System.out.println(this.getLeben()+" reduziert.");
	}
	
	@Override
	public String getName() {return this.name;}
	@Override
	public int getLeben() {return this.leben;}
	@Override
	public IOpfertier fortpflanze()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
