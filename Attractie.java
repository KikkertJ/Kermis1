
public abstract class Attractie {
	String naam;
	double prijs;
	int oppervlakte;
	double omzetAttractie;
	int kaartAttractie;

	public void draaien(String naam, double prijs) {
		kaartAttractie = kaartAttractie + 1;
		Kassa.kaartenKermis = Kassa.kaartenKermis + 1;
		System.out.println("De attractie: " + naam + ", kost: " + prijs + " euro om te draaien.");
		omzetAttractie = omzetAttractie + prijs;
		Kassa.OmzetKermis = Kassa.OmzetKermis + prijs;
	}
	public void getOmzet() {
		System.out.println(naam + ": €" + omzetAttractie);
	}

	public void getKaarten() {
		System.out.println(naam + ": " + kaartAttractie);

	};
}