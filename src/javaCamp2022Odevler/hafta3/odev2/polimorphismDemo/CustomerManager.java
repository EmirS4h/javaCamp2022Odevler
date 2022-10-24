package javaCamp2022Odevler.hafta3.odev2.polimorphismDemo;

public class CustomerManager {
	private BaseLogger logger;

	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}
	
	public void add() {
		System.out.println("Müşteri eklendi ");
		logger.log("Müşteri eklendi");
	}
}
