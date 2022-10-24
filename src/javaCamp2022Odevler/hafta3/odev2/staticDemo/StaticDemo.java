package javaCamp2022Odevler.hafta3.odev2.staticDemo;

public class StaticDemo {
	public static void run() {
		Product product1 = new Product();
		product1.id = 1;
		product1.name = "Mouse";
		product1.price = 10.0;
		
		ProductManager productManager = new ProductManager();
		productManager.add(product1);
		
		DatabaseHelper.Crud.update();
		DatabaseHelper.Connection.connect();
	}
}
