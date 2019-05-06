
public class Spin extends RisicoRijkeAttractie implements GokAttractie {

	static double Belasting;
	int aftedragenSpin;
	int rondjesAfgedragenSpin;

	public void draaibeurten() {
		draaiLimietSpin++;
		monteuroproepen();
	}

	
	public void kansSpelBelastingBetalen() {
		// TODO Auto-generated method stub
		aftedragenSpin = kaartAttractie - rondjesAfgedragenSpin;
		Belasting = aftedragenSpin * 5.0 * kansSpelBelastingPercentage;
		rondjesAfgedragenSpin = kaartAttractie;
	}
}

