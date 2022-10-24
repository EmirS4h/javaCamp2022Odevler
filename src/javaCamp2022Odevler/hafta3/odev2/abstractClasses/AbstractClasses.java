package javaCamp2022Odevler.hafta3.odev2.abstractClasses;

public class AbstractClasses {
	public static void run() {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		GameCalculator gameCalculator = new OlderGameCalculator();
		gameCalculator.hesapla();
	}
}
