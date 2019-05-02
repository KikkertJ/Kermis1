
public class Spin extends RisicoRijkeAttractie {


	public void draaibeurten() {
		draaiLimietSpin++;
		draaiLimiet();
	}

	@Override
	public void getOmzet() {
		System.out.println(naam + ": €" + omzetAttractie);
	}
	

	@Override
	public void getKaarten() {
		System.out.println(naam + ": " + kaartAttractie);

	}
}

