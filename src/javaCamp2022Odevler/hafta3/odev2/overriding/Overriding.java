package javaCamp2022Odevler.hafta3.odev2.overriding;

public class Overriding {
	public static void run() {

		BaseKrediManager[] krediManagers = new BaseKrediManager[] { new OgretmenKrediMaanger(), new TarimKrediManager(),
				new OgrenciKrediManager() };

		for (BaseKrediManager krediManager : krediManagers) {
			System.out.println(krediManager.hesapla(10000.0));
		}
	}
}
