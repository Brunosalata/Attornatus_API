package entities;

import java.util.ArrayList;
import java.util.List;

public class Persona {

	private String name;
	private String data;
	private List<Address> addressList = new ArrayList<>();
	
	public Persona() {
	}

	public Persona(String name, String data) {
		this.name = name;
		this.data = data;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public List<Address> getAddress(){
		return addressList;
	}
	
	//Add address
	public void addAddress(Address address) {
		addressList.add(address);
	}
	
	//Revome address
	public void removeAddress(Address address) {
		addressList.remove(address);
	}
	
	//Address list
	public void addressList() {
		for (Address address : addressList) {
			address.toString();
		}
	}
	
	//Set as principal address
	public boolean setPrincipalAddress(boolean principalAdress) {
		for(Address address : addressList) {
			if(address.isPrincipalAddress() == true) {
				address.setPrincipalAddress(false);
			}
		}
		return principalAdress = true;
	}
	
	@Override
	public String toString() {
		return  
				"Name: "
				+ name
				+ "\nData: "
				+ data
				+ "\n"
				+ "Address: \n"
				+ addressList.toString()
				+ "\n";
	}
	
	
	
}
