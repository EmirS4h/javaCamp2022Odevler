package javaCamp2022Odevler.hafta3.odev1;

public class Company extends Customer {

	private String taxNumber;

	public Company(String taxNumber, int id, String firstName, String lastName, String nationalIdentity, String city) {
		super(id, firstName, lastName, nationalIdentity, city);
		this.taxNumber = taxNumber;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

}
