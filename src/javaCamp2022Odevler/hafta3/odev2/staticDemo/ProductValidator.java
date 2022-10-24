package javaCamp2022Odevler.hafta3.odev2.staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("Yapıcı blok çalıştı");
	}
	
	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	// inner class
	public static class BaskBirClass {
		public static void sil() {
			
		}
	}
}
