package javaCamp2022Odevler.hafta3.odev2.interfaces;

public class OracleCustomerDal implements ICustomerDal{

	@Override
	public void add() {
		System.out.println("Oracle veri tabanına eklendi");
	}

}
