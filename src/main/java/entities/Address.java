package entities;

import org.hibernate.annotations.Table;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Table(appliesTo = "tb_address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String street;
	private int postalCode;
	private int number;
	private String city;
	private boolean principalAddress = true;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "persona_id")
	private Persona persona;
	
	public Address() {
	}
	
	public Address(int id, String street, int postalCode, int number, String city, boolean principalAddress) {
		this.id = id;
		this.street = street;
		this.postalCode = postalCode;
		this.number = number;
		this.city = city;
		this.principalAddress = principalAddress;
	}

	public int getPersonaId() {
		return id;
	}
	
	public void setPersonaId(int id) {
		this.id = id;
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
	
	public boolean getPrincipalAddress() {
		return principalAddress;
	}

	public void setPrincipalAddress(boolean principalAddress) {
		this.principalAddress = principalAddress;
	}

	@Override
	public String toString() {
		return "Street: " 
				+ street
				+ "\nPostal Code: "
				+ postalCode
				+ "\nNumber: "
				+ number
				+ "\nCity: "
				+ city
				+ "\nPrincipal Address: "
				+ principalAddress
				+ "\n";

	}

	public void setId(int personaId) {
		// TODO Auto-generated method stub
		
	}
	
}
