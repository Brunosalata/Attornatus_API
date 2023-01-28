package entities;

import java.util.ArrayList;
import java.util.List;

public class Persona {

	private String name;
	private String data;
	private List<Adress> adressList = new ArrayList<>();
	
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
	
	public List<Adress> getAdress(){
		return adressList;
	}
	
	//Add adress
	public void addAdress(Adress adress) {
		adressList.add(adress);
	}
	
	//Revome adress
	public void removeAdress(Adress adress) {
		adressList.remove(adress);
	}
	
	//Adress list
	public void AdressList() {
		for (Adress adress : adressList) {
			adress.toString();
		}
	}
	
	//Set as principal adress
	public boolean setPrincipalAdress(boolean principalAdress) {
		for(Adress adress : adressList) {
			if(adress.isPrincipalAdress() == true) {
				adress.setPrincipalAdress(false);
			}
		}
		return principalAdress = true;
	}
	
	public String toString() {
		return  
				"Name: "
				+ name
				+ "\nData: "
				+ data
				+ "\n";
	}
	
	
	
}
