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
			opfer.schreie();
			opfer.stirb();
//			opfer.setLeben(0);
			System.out.println("Tiger frisst Opfer!");
			return true;
		} else {
			System.out.println("Tiger verschont Opfer!");
			return false;
		}
	}

	@Override
	public String kampfschrei() {
		return this.getName()+": RAAAR!!! Auf nach Rom!";
	}
	@Override
	public void aua() {
		System.out.println("");
	}

	@Override
	public String getName() { return this.name; }
	@Override
	public int getLeben() { return this.leben; }
	@Override
	public boolean lebendig() {
		if (this.getLeben()>0) {return true;} 
		else {return false;}		
	}

		

}
