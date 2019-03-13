package haupt;
import java.util.concurrent.ThreadLocalRandom;

// COMMIT FORCE
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class StreichelZoo
{
	public static final boolean DEBUG = true;
	public static void main(String[] args) throws Exception
	{	
	System.out.println("HALLO GIT");
	Integer i = new Integer(1);
	
	i.equals(3);
//	JFrame hauptwindow = new JFrame();
//	JPanel hauptpanel = new JPanel();
//	JButton jbb = new JButton("OK");
//
//	hauptwindow.add(hauptpanel);
//	hauptpanel.add(jbb);
//	
//	
//	hauptwindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//	hauptwindow.pack();
//	hauptwindow.setVisible(true);
//	Thread.sleep(3000);
//	hauptwindow.setVisible(false);
//	Thread.sleep(3000);
//	hauptwindow.setVisible(true);
	
	Wolf roger = new Wolf();
	Tiger oleg = new Tiger();
	Puma robert = new Puma();
	Eisbaer robin = new Eisbaer();
	Loewe joachim = new Loewe();
	//Panther daniel = new Panther();
	Hai steffen = new Hai("Sharkie", 10);
	System.out.println(steffen);
	steffen.fresse(new Gazelle());
//	joachim.fresse(new Fisch());
//	robin.fresse(new Robbe("kip", 2));
	
//	Pinguin pp = new Pinguin();
//	Ratte rr = new Ratte();
	
	
//	------  OLEG  ------
	Gazelle john = new Gazelle();
	oleg.kampfschrei();
	john.schreie();
	john.aua();

	oleg.fresse(john);
	john.schreie();

	
	IRaubtier[] raubtiere = new IRaubtier[100];
	IOpfertier[] opfer = new IOpfertier[raubtiere.length];
	for (int j = 0; j < raubtiere.length; j++) 
	{
	
		switch(ThreadLocalRandom.current().nextInt(4)) 
		{
			case 0: opfer[j] = new Gazelle();  break;
			case 1: opfer[j] = new Fisch();  break;
			case 2: opfer[j] = new Robbe("Robbe "+i, 3) ;  break;
			case 3: opfer[j] = new Zebra();  break;
		}
		
		switch(ThreadLocalRandom.current().nextInt(6)) 
		{
			case 0: raubtiere[j] = new Wolf();  break;
			case 1: raubtiere[j] = new Tiger();  break;
			case 2: raubtiere[j] = new Puma();  break;
			case 3: raubtiere[j] = new Eisbaer();  break;
			case 4: raubtiere[j] = new Loewe(); break;
			case 5: raubtiere[j] = new Hai("Hai "+j, 10);  break;
		}
		raubtiere[j].fresse(opfer[j]);
	}
//	------  OLEG-ENDE  ------
	
	
  }
 }
