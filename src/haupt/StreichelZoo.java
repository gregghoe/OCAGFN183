package haupt;

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
	
	JFrame hauptwindow = new JFrame();
	JPanel hauptpanel = new JPanel();
	JButton jbb = new JButton("OK");

	hauptwindow.add(hauptpanel);
	hauptpanel.add(jbb);
	
	
	hauptwindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	hauptwindow.pack();
	hauptwindow.setVisible(true);
	Thread.sleep(3000);
	hauptwindow.setVisible(false);
	Thread.sleep(3000);
	hauptwindow.setVisible(true);
	
	Wolf roger = new Wolf();
	Tiger oleg = new Tiger();
	Puma robert = new Puma();
	Eisbaer robin = new Eisbaer();
	Loewe joachim = new Loewe();
	//Panther daniel = new Panther();
	Hai steffen = new Hai("Sharkie", 10);
	
	steffen.fresse(new Gazelle());
	joachim.fresse(new Fisch());
	robin.fresse(new Robbe("kip", 2));
	
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
