package com.axsos.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.relationships.models.Person;
import com.axsos.relationships.repositories.PersonRepository;

@Service
public class PersonService {
	private final PersonRepository personRepository;

	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	//all persons
	public List<Person> allPersons() {
		return personRepository.findAll();
	}
	//create new person
	public Person createPerson(Person person) {
		return personRepository.save(person);
	}
	//find person
	public Person findPerson(Long id) {
		Optional<Person> optionalPerson = personRepository.findById(id);
		if (optionalPerson.isPresent()) {
			return optionalPerson.get();
		} else {
			return null;
		}
	}
	
	

}
