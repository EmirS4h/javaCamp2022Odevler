package javaCamp2022Odevler.hafta3.odev2.overriding;

public class OgrenciKrediManager extends BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar * 1.10;
	}
}