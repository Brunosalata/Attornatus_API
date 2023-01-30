/*package controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import entities.Address;
import entities.Persona;
import services.AddressService;

public interface AddressController {

	@Autowired
	private AddressService service;
	
	@PostMapping
	public ResponseEntity<Address> create(@RequestBody Address address){
		Address newAddress = service.create(address);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newAddress.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Address> findById(@PathVariable Integer id){
		Address address = this.service.findById(id);
		return ResponseEntity.ok().body(address);
	}
	
	@PutMapping(value="/{id}")
	public ResponseEntity<Address> update(@PathVariable Integer id, @RequestBody Address address){
		Address newAddress = service.update(id, address);
		return ResponseEntity.ok().body(newAddress);
	}
}*/
