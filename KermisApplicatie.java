import java.util.Scanner;

public class KermisApplicatie {
	public static void main(String[] args) {
		// aanmaken van de attracties
		Attractie botsauto = new Botsautos();
		Attractie spin = new Spin();
		Attractie hawaii = new Hawaii();
		Attractie ladderklimmen = new Ladderklimmen();
		Attractie spiegelpaleis = new Spiegelpaleis();
		Attractie spookhuis = new Spookhuis();
		Kassa kassa = new Kassa();
		BelastingInspecteur inspecteur = new BelastingInspecteur();
		boolean doorgaan;
		System.out.println(
				"Welkom bij de kermis! Om een een attractie te laten draaien kun je de de cijfers 1 t/m 6 invoeren.");
		System.out.println(
				"Je hebt keuze uit de volgende attracties: \n 1. Botsie botsers; \n 2. Spinning spinnetje; \n 3. Ananas Hawaii; \n 4. Laddervallen \n 5. Spiegeltje aan de wand; \n 6. Het huis van Casper. \n");

		// attractienummer invoeren en aanroepen

		while (doorgaan = true) {
			String starter;
			if (inspecteur.Controle()) {
				starter = "b";
			}else {
				Scanner invoer = new Scanner(System.in);
				starter = invoer.next();
			}
			
			switch (starter) {
			case "1": 
				doorgaan = true;
				botsauto.draaien("Botsie botsers", 2.50);
				break;
			
			case "2": 
				doorgaan = true;
				spin.draaien("Spinning spinnetje", 2.25);
				((Spin) spin).draaibeurten();
				break;
			
			case "3": 
				doorgaan = true;
				hawaii.draaien("Ananas Hawaii", 2.90);
				((Hawaii) hawaii).draaibeurten();
				break;
			
			case "4": 
				doorgaan = true;
				ladderklimmen.draaien("Laddervallen", 5.00);
				break;
			
			case "5": 
				doorgaan = true;
				spiegelpaleis.draaien("Spiegeltje aan de wand", 2.75);
				break;
			
			case "6": 
				doorgaan = true;
				spookhuis.draaien("Huis van Casper", 3.20);
				break;
			
			case "o": 
				kassa.Kermisomzet();
				System.out.println("Omzet per attractie:");
				botsauto.getOmzet();
				spin.getOmzet();
				hawaii.getOmzet();
				ladderklimmen.getOmzet();
				spiegelpaleis.getOmzet();
				spookhuis.getOmzet();
				break;
			
			case "k": 
				kassa.TotaleKaarten();
				System.out.println("Aantal kaarten per attractie: \n");
				botsauto.getKaarten();
				spin.getKaarten();
				hawaii.getKaarten();
				ladderklimmen.getKaarten();
				spiegelpaleis.getKaarten();
				spookhuis.getKaarten();
				break;
			case "b":
				((Spin) spin).kansSpelBelastingBetalen();
				((Ladderklimmen) ladderklimmen).kansSpelBelastingBetalen();
				Kassa.BelastingKermis();


			case "a":
				doorgaan = false;
				break;
			default: 
				doorgaan = true;
				System.out.println("Er wordt geen attractie gestart.");
				break;
			
			}
		}
	}
}
