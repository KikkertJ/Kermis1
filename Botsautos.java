
public class Botsautos extends Attractie {
	
	@Override
	public void getOmzet() {
		System.out.println(naam + ": €" + omzetAttractie);
	}

	@Override
	public void getKaarten() {
		System.out.println(naam + ": " + kaartAttractie);

	}
}
