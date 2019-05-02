
public class Hawaii extends RisicoRijkeAttractie {

	public void draaibeurten() {
		draaiLimietHawaii++;
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
