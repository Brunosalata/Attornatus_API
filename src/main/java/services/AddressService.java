/*package services;

import java.net.URI;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import entities.Persona;
import services.exceptions.PersonaNotFoundException;

public class AddressService {

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
	
}*/
