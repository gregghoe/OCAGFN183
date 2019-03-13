package haupt;

public class StreichelZoo
{
	public static final boolean DEBUG = true;
	public static void main(String[] args)
	{	
	System.out.println("HALLO GIT");
	
	Wolf roger = new Wolf();
	Tiger oleg = new Tiger();
	Puma robert = new Puma();
	Eisbaer robin = new Eisbaer();
	Loewe joachim = new Loewe();
	Panther daniel = new Panther();
//	Hai steffen = new Hai();
	
	
//	Pinguin pp = new Pinguin();
//	Ratte rr = new Ratte();
	
	
//	------  OLEG  ------
	Gazelle john = new Gazelle();
	oleg.kampfschrei();
	john.schreie();
	john.aua();

	oleg.fresse(john);
	john.schreie();
//	------  OLEG-ENDE  ------
	
	
  }
 }
