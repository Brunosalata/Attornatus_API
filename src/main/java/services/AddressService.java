package services;

import org.springframework.beans.factory.annotation.Autowired;

import entities.Address;
import repositories.AddressRepository;

public class AddressService {

	@Autowired
	private AddressRepository repository;
	
	//Creating a new address
	public Address create(Address address) {
		return repository.save(address);
	}
		
	
}
