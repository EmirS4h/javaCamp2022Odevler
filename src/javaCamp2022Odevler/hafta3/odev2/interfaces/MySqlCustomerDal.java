package javaCamp2022Odevler.hafta3.odev2.interfaces;

public class MySqlCustomerDal implements ICustomerDal,IRepository {

	@Override
	public void add() {
		System.out.println("MySql veri tabanına eklendi");
	}

}
