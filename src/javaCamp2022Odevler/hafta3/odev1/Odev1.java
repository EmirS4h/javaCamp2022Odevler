package javaCamp2022Odevler.hafta3.odev1;

public class Odev1 {
	public static void run() {
		CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.save();

		Customer customer = new Customer(1, "Emir", "Demir", "123456","İstanbul");

		CustomerManager customerManager = new CustomerManager();
		customerManager.save(customer);

		int[] sayilar = new int[] { 1, 2, 3, 5, 6 };
	}
}
