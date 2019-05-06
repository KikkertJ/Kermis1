
public class Kassa {
static double OmzetKermis;
static int kaartenKermis;
static double kansSpelBelasting;
static double BelastingLadder;
static double BelastingSpin;


public void Kermisomzet() {
	System.out.println("Totale omzet: " + OmzetKermis);
}
public void TotaleKaarten() {
	System.out.println("Totaal aantal verkochte kaartjes: " + kaartenKermis);
}
public static void BelastingKermis() {
	BelastingLadder = Ladderklimmen.Belasting;	
	BelastingSpin = Spin.Belasting;
	kansSpelBelasting = Ladderklimmen.Belasting + Spin.Belasting;
	System.out.println("\nDe belasting inspecteur komt langs. \n" + "Er wordt in totaal €" + kansSpelBelasting + " aan de inspecteur betaald.");
	System.out.println("Dit is per attractie: \n- Laddervallen: €" + BelastingLadder + "\n- Spinning Spinnetje: €" + BelastingSpin);
}
}
