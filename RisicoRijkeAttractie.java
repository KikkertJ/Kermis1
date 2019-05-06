import java.util.Scanner;

public abstract class RisicoRijkeAttractie extends Attractie {
	static int draaiLimietHawaii;
	static int draaiLimietSpin;
	static boolean limietBereikt;
	static Scanner monteur = new Scanner(System.in);

	static void draaiLimiet() throws Exception{
		if (draaiLimietSpin > 5 || draaiLimietHawaii > 10) 
			throw new Exception();
		
//			limietBereikt = true;
//			System.out.println("Er moet een monteur komen. Druk op 'm' om de monteur te roepen.");
//			monteuroproepen();
//		}
//		if (draaiLimietHawaii > 10 ) {
//			limietBereikt = true;
//			System.out.println("Er moet een monteur komen. Druk op 'm' om de monteur te roepen.");
//			monteuroproepen();
//		}
	}


	public static void monteuroproepen() {
		// TODO Auto-generated method stub
		try { draaiLimiet();
		
		} catch (Exception e){ 
			limietBereikt = true;
		}
		while (limietBereikt) {
			String onderhoudsm = monteur.next();
			switch (onderhoudsm) {
			case "m": {
				limietBereikt = false;
				System.out.println("Het onderhoud is uitgevoerd. Je kan nu verder.");
				Monteur.reset();
			}
				break;
			default: {
				limietBereikt = true;
				System.out.println("Er moet een monteur komen. Druk op 'm' om de monteur te roepen.");
				break;
			}
			}
		}
	}
}