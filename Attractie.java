
public abstract class Attractie {
	String naam;
	double prijs;
	int oppervlakte;
	double omzetAttractie;
	int kaartAttractie;

	public abstract void draaien(String naam, double prijs);
	public abstract void getOmzet();
	public abstract void getKaarten();
}