package javaCamp2022Odevler.hafta3.odev2.abstractsDemo;

public class CustomerManager {
	private BaseDatabaseManager databaseManager;
	
	public CustomerManager(BaseDatabaseManager databaseManager) {
		this.databaseManager = databaseManager;
	}
	
	public void getCustomers() {
		databaseManager.getData();
	}
}
