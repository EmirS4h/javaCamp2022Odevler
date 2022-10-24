package javaCamp2022Odevler.hafta3.odev2.abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla();

	public final void gameOver() {
		System.out.println("Game Over");
	}
}
