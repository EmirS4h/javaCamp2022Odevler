package javaCamp2022Odevler.hafta3.odev2.polimorphismDemo;

public class PolimorphismDemo {
	public static void run() {
		BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new EmailLogger(), new DatabaseLogger(),
				new ConsoleLogger() };

		for (BaseLogger logger : loggers) {
			logger.log("mesaj");
		}

		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();
	}
}
