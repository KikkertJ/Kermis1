
public class Spin extends RisicoRijkeAttractie {
	double omzet = 0.0;
	int kaartjes = 0;
	

	@Override
	public void draaien(String attractienaam, double attractieprijs) {
		// TODO Auto-generated method stub
		this.naam = attractienaam;
		this.prijs = attractieprijs;
		omzet = omzet + this.prijs;
		kaartjes = kaartjes + 1;
		draaiLimietSpin++;
		draaiLimiet();
		Kassa.OmzetKermis = Kassa.OmzetKermis + this.prijs;
		Kassa.kaartenKermis = Kassa.kaartenKermis + 1;
		System.out.println("De attractie: " + naam + ", kost: " + prijs + " euro om te draaien.");
	}

	@Override
	public void getOmzet() {
		this.omzetAttractie = omzet;
		System.out.println(naam + ": €" + omzetAttractie);
	}
	

	@Override
	public void getKaarten() {
		this.kaartAttractie = kaartjes;
		System.out.println(naam + ": " + kaartAttractie);

	}
}

