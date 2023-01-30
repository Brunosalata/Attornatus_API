package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Address;
import entities.Persona;
import repositories.PersonaRepository;
import services.exceptions.PersonaNotFoundException;

@Service
public class PersonaService {

	@Autowired 
	private PersonaRepository repository;
	
	//Creating a new person
	@SuppressWarnings("null")
	public Persona create(Persona person) {
		person.setId((Integer) null);
		return repository.save(person);
	}
	
	//Searching a profile
	public Persona findById(Integer id) {
		Optional<Persona> persona = repository.findById(id);
		return persona.orElseThrow(() -> new PersonaNotFoundException("Person not found!"));
	}

	//List of profiles
	public List<Persona> findAll() {
		return repository.findAll();
	}

	//Profile update
	public Persona update(Integer id, Persona person) {
		Persona newPersona = findById(id);
		newPersona.setName(person.getName());
		newPersona.setData(person.getData());
		return repository.save(newPersona);
	}

	//Add an address to profile
	public Persona addAddress(Address address) {
		Persona newPersona = findById(address.getPersonaId());
		if(address.getPrincipalAddress()==true) {
			newPersona.isPrincipalAddress(address);
		}
		newPersona.addAddress(address);
		return repository.save(newPersona);
	}

	//Profile delete
	public void delete(Integer id) {
		findById(id);
		repository.deleteById(id);	
	}
	

	
}
