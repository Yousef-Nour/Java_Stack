package com.axsos.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.languages.models.Language;
import com.axsos.languages.reprositories.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository languageRepository;

	public LanguageService(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	//return all languages
	public List<Language> allLanguages(){
		return languageRepository.findAll();
	}
	
	//create language
	public Language createLanguage(Language l) {
		return languageRepository.save(l);
	}
	 //find Language
	public Language findLanguage(Long id) {
		Optional<Language> optionalLanguage = languageRepository.findById(id);
		if (optionalLanguage.isPresent()) {
			return optionalLanguage.get();
		} else {
			return null;
		}
	}
	//edit and update language
	public Language updateLanguage(Language l) {
		return languageRepository.save(l);
	}
	//delete language
	  public void deleteLanguage(Long id) {
	        languageRepository.deleteById(id);
	    }

}
