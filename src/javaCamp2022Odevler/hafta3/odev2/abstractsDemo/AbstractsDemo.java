package javaCamp2022Odevler.hafta3.odev2.abstractsDemo;

public class AbstractsDemo {
	public static void run() {
		CustomerManager customerManager = new CustomerManager(new MysqlDatabaseManager());
		customerManager.getCustomers();
	}
}
