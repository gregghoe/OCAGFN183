package haupt;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Tier
{
	private int leben;
	public  ArrayList<Floh> floehe = null;
	public boolean dummy;
	public Tier() 
	{
		this.floehe = new ArrayList<Floh>();
		int n = ThreadLocalRandom.current().nextInt(1, 6);
		for (int i = 0; i < n; i++) {
			floehe.add(new Floh(getName()+"'s Floh #"+(i+1)));
		}
	}
	
	public boolean begegne(Tier tier) {
		boolean b = ThreadLocalRandom.current().nextBoolean();
		if(b) {
			ArrayList<Floh> temp = new ArrayList<>();
			temp.addAll(this.floehe); // Eigene Fl�he
			temp.addAll(tier.floehe); // Fremde Fl�he
			this.floehe.clear(); // Eigene Fl�he l�schen
			tier.floehe.clear(); // Fremde Fl�he l�schen
			
			temp.forEach((e) -> {if(Math.random()<0.5) {this.floehe.add(e);} else{tier.floehe.add(e);}});
			// M�gliche andere L�sungen:
			//dummy = (ThreadLocalRandom.current().nextBoolean()) ? this.floehe.add(e) : tier.floehe.add(e));
//			for (Floh floh : temp) 
//			{
//				if(ThreadLocalRandom.current().nextBoolean()) {
//					this.floehe.add(floh);
//				} else {tier.floehe.add(floh);
//				}
//			}	
			System.out.println("Fl�he gewechselt!");
		} else {
			System.out.println("Fl�he bleiben wo Sie sind!");
		}
		return b;
	}
	public abstract boolean lebendig();
	public abstract void aua();
	
	public int getLeben() {return this.leben;}
	public abstract String getName();
}