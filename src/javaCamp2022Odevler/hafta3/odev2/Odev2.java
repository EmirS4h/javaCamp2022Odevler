package javaCamp2022Odevler.hafta3.odev2;

import javaCamp2022Odevler.hafta3.odev2.abstractClasses.AbstractClasses;
import javaCamp2022Odevler.hafta3.odev2.abstractsDemo.AbstractsDemo;
import javaCamp2022Odevler.hafta3.odev2.inheritanceDemo.KrediUI;
import javaCamp2022Odevler.hafta3.odev2.inheritanceDemo.OgretmenKrediManager;
import javaCamp2022Odevler.hafta3.odev2.interfaceDemo.InterfaceDemo;
import javaCamp2022Odevler.hafta3.odev2.interfaces.Interfaces;
import javaCamp2022Odevler.hafta3.odev2.overriding.Overriding;
import javaCamp2022Odevler.hafta3.odev2.polimorphismDemo.PolimorphismDemo;
import javaCamp2022Odevler.hafta3.odev2.staticDemo.StaticDemo;

public class Odev2 {
	public static void run() {
		ProductManager productManager = new ProductManager();

		Product product1 = new Product(1, "Pc", "8 GB RAM", 12000.0, 21);

		productManager.add(product1);

		DortIslem dortIslem = new DortIslem();

		System.out.println(dortIslem.topla(5, 6));
		System.out.println(dortIslem.topla(1, 2, 3));
		
		/* INHERITANCE */
		
		Customer customer = new Customer();
		Employee employee = new Employee();
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.list();
		
		EmployeeManager employeeManager = new EmployeeManager();
		employeeManager.employeeOfTheMonth();
		
		/* INHERITANCE DEMO */
		KrediUI.krediHesapla(new OgretmenKrediManager());
		
		/* POLIMORPHISM DEMO */
		PolimorphismDemo.run();
		
		/* OVERRIDING */
		Overriding.run();
		
		/* ABSTRACT CLASSES */
		AbstractClasses.run();
		
		/* ABSTRACTS DEMO */
		AbstractsDemo.run();
		
		/* INTERFACES */
		Interfaces.run();
		
		/* INTERFACE DEMO */
		InterfaceDemo.run();
		
		/* STATIC DEMO */
		StaticDemo.run();
	}
}
