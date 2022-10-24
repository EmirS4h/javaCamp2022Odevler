package javaCamp2022Odevler.hafta3.odev2.interfaces;

public class SqlServerCustomerDal implements ICustomerDal{

	@Override
	public void add() {
		System.out.println("Sql Server veri tabanına eklendi");
	}

}
