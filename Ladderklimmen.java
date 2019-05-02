
public class Ladderklimmen extends Attractie implements GokAttractie {
	
	Kassa kassa = new Kassa();
	
	@Override
	public void getOmzet() { 
		 System.out.println( naam + ": €" + omzetAttractie);
	 }

	@Override
	public void getKaarten() {
			 System.out.println( naam + ": " + kaartAttractie);
		
	}

	@Override
	public void kansSpelBelastingBetalen() {
		// TODO Auto-generated method stub
		kassa.kansSpelBelasting = omzetAttractie * kansSpelBelastingPercentage;
	System.out.println(kassa.kansSpelBelasting);	
	}
	
}
