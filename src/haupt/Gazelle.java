package haupt;

import java.util.concurrent.ThreadLocalRandom;

public class Gazelle extends Tier implements IOpfertier {

	private String name;
	private int leben;
	
	public Gazelle() {
		this.name = "John";
		this.leben = 10;
	}
	@Override
	public void schreie() {
		System.out.println("Gazelle "+this.getName()+": ÄHHH!!!");
	}
	@Override
	public void stirb() {
		this.leben = 0;
	}
	@Override
	public boolean lebendig() {
		if (this.getLeben()>0) {return true;} 
		else {return false;}
	}
	@Override
	public void aua() {
		this.leben =- ThreadLocalRandom.current().nextInt(getLeben()-1);
		System.out.println("Gazelle "+this.getName()+": AUA");
	}
	
	@Override
	public String getName() {return this.name;}
	@Override
	public int getLeben() {return this.leben;}

}
