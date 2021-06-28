package com.axsos.relationships.services;

import org.springframework.stereotype.Service;

import com.axsos.relationships.models.License;

import com.axsos.relationships.repositories.LicenseRepository;

@Service
public class LicenseService {
	private final LicenseRepository licenseRepository;

	public LicenseService(LicenseRepository licenseRepository) {
		this.licenseRepository = licenseRepository;
	}
	
	//create new license
	public License createLicense(License license) {
		return licenseRepository.save(license);
	}
	

}
