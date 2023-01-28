package entities;

public class Adress {

	private String street;
	private int postalCode;
	private int number;
	private String city;
	private boolean principalAdress = true;
	
	public Adress() {
	}
	
	public Adress(String street, int postalCode, int number, String city) {
		this.street = street;
		this.postalCode = postalCode;
		this.number = number;
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setPrincipalAdress(boolean principalAdress) {
		this.principalAdress = false;
	}
	
	public boolean isPrincipalAdress() {
		return principalAdress;
	}
	
	public String toString() {
		return "Street: " 
				+ street
				+ "\nPostal Code: "
				+ postalCode
				+ "\nNumber: "
				+ number
				+ "\nCity: "
				+ city
				+ "\n\n";
	}
	
}
