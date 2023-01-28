package com.Attornatus.ProfileAPI.Attornatus_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import entities.Address;
import entities.Persona;

@SpringBootApplication
public class AttornatusApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AttornatusApiApplication.class, args);
		
		List<Persona> persons = new ArrayList<>();
		
		//Create a new person
		Persona person = new Persona("Bruno", "20/12/1988");
		Address address = new Address("Iwagiro Toyama", 13564380, 261, "Sao Carlos");
		person.addAddress(address);
		persons.add(person);
		
		//Create an address to profile
		Address address2 = new Address("Iwagiro Toyama", 13564380, 261, "Sao Carlos");
		Persona personNewAdress = persons.stream().filter(x->x.getName()=="Bruno").findFirst().get();
		personNewAdress.addAddress(address2);
		
		//Consulting a person profile
		Persona personConsult = persons.stream().filter(x->x.getName()=="Bruno").findFirst().get();
		System.out.println(personConsult);
		personConsult.addressList();
		
		//Edit a person profile
		Persona personEdit = persons.stream().filter(x->x.getName()=="Bruno").findFirst().get();
		personEdit.setName("Maria");
		personEdit.setData("29/03/1989");
		
		//Listing persons
		for(Persona personsList : persons) {
			System.out.println(personsList);
		}
		//or Arrays.asList(persons).toString();

		//Listing profile address
		Persona personAddress = persons.stream().filter(x->x.getName()=="Bruno").findFirst().get();
		personAddress.addressList();
		
	}

}
