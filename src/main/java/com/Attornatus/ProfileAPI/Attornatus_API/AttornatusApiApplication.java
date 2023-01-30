package com.Attornatus.ProfileAPI.Attornatus_API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import entities.Address;
import entities.Persona;
import repositories.AddressRepository;
import repositories.PersonaRepository;

@SpringBootApplication
public class AttornatusApiApplication implements CommandLineRunner{

	@Autowired
	private PersonaRepository personaRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(AttornatusApiApplication.class, args);		
	}

	@Override
	public void run(String... args) throws Exception {
		
		//Create a new person
		Persona person = new Persona(1, "Bruno", "20/12/1988");
		Address address = new Address(1, "Iwagiro Toyama", 13564380, 261, "Sao Carlos", true);
		addressRepository.save(address);
		///persons.add(person);
		personaRepository.save(person);
		
	}


	
}
