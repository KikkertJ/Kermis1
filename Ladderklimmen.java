
public class Ladderklimmen extends Attractie implements GokAttractie {
	static double Belasting;
	int aftedragen;
	int rondjesAfgedragen;
	
	public void kansSpelBelastingBetalen() {
		// TODO Auto-generated method stub
		aftedragen = kaartAttractie - rondjesAfgedragen;
		Belasting = aftedragen * 5.0 * kansSpelBelastingPercentage;
		rondjesAfgedragen = kaartAttractie;
		
	}

}
