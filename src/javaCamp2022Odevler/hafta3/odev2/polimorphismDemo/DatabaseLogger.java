package javaCamp2022Odevler.hafta3.odev2.polimorphismDemo;

public class DatabaseLogger extends BaseLogger {
	public void log(String message) {
		System.out.println("Logged to database : " + message);
	}
}
