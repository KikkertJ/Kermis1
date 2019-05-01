

public class Monteur {
	static Spin spin = new Spin();
	static Hawaii hawaii = new Hawaii();

	

	public static void reset() {
		if (RisicoRijkeAttractie.draaiLimietHawaii >= 10) {
			RisicoRijkeAttractie.draaiLimietHawaii = 0;
			
		}
		if (RisicoRijkeAttractie.draaiLimietSpin >= 5 ) {
			RisicoRijkeAttractie.draaiLimietSpin = 0;
		}
	}
}
