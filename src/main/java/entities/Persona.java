package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.Table;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
@Table(appliesTo = "tb_persona")
public class Persona implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private String data;
	
	@OneToMany(mappedBy = "persona")
	private List<Address> addressList = new ArrayList<>();
	
	public Persona() {
	}

	public Persona(Integer id, String name, String data) {
		this.id = id;
		this.name = name;
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	public void isPrincipalAddress(Address address) {
		for(Address principal : addressList)
			principal.setPrincipalAddress(false);
		address.setPrincipalAddress(true);
	}
	
	//Add address
	public void addAddress(Address address) {
		addressList.add(address);
	}
	
	//Remove address
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
			if(address.getPrincipalAddress() == true) {
				address.setPrincipalAddress(false);
			}
		}
		return principalAdress = true;
	}
	
	@Override
	public String toString() {
		return  
				"Id: "
				+ id
				+ "\nName: "
				+ name
				+ "\nData: "
				+ data
				+ "\n"
				+ "Address: \n"
				+ addressList.toString()
				+ "\n";
	}
	
	
	
}
