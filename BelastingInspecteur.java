import java.util.Random;

public class BelastingInspecteur {
	boolean Controle () {
		Random controle = new Random();
		return controle.nextInt(15) == 3;
		
	}

}
