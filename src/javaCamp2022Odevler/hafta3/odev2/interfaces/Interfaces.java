package javaCamp2022Odevler.hafta3.odev2.interfaces;

public class Interfaces {
	public static void run() {
		CustomerManager customerManager = new CustomerManager(new SqlServerCustomerDal());
		customerManager.add();
	}
}
