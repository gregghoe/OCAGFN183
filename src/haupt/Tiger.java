package haupt;

import java.util.concurrent.ThreadLocalRandom;

public class Tiger extends Tier implements IRaubtier {
	private String 	name;
	private int		leben;
	
	public Tiger() {
		this.name = "Nero";
		this.leben = 10;
	}

	@Override
	public boolean fresse(IOpfertier opfer) {
		if(ThreadLocalRandom.current().nextBoolean()) {
			opfer.stirb();
			System.out.println("Tiger frisst Opfer!");
			return true;
		} else {
			System.out.println("Tiger verschont Opfer!");
			return false;
		}
	}
	@Override
	public String kampfschrei() {
		String s ="";
		if(this.lebendig()) {
			s=this.getName()+"(Leben="+this.getLeben()+"): RAAAR!!! Auf nach Rom!";
		} else {
			s="Tiger tot";
		}
		System.out.println(s);
		return s;
	}
	@Override
	public void aua() {
		System.out.print("Tiger "+this.getName()+" Leben von "
				+this.getLeben()+" auf ");
		this.leben-=ThreadLocalRandom.current().nextInt(this.leben);
		System.out.println(this.getLeben()+" reduziert.");
	}
	@Override
	public boolean lebendig() {
		if (this.getLeben()>0) {return true;} 
		else {return false;}		
	}
	
	@Override
	public String getName() { return this.name; }
	@Override
	public int getLeben() { return this.leben; }
}
