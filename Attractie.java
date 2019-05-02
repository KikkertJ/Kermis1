
public abstract class Attractie {
	String naam;
	double prijs;
	int oppervlakte;
	double omzetAttractie;
	int kaartAttractie;

	public void draaien(String naam, double prijs) {
		omzetAttractie = omzetAttractie + prijs;
		kaartAttractie = kaartAttractie + 1;
		Kassa.OmzetKermis = Kassa.OmzetKermis + prijs;
		Kassa.kaartenKermis = Kassa.kaartenKermis + 1;
		System.out.println("De attractie: " + naam + ", kost: " + prijs + " euro om te draaien.");
	}
	public abstract void getOmzet();
	public abstract void getKaarten();
}