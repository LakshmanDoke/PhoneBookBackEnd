package com.laksh.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.laksh.entities.PhoneNoEntity;
import com.laksh.model.PhoneNo;
import com.laksh.repositories.PhoneBookRepo;

import java.util.List;

@RestController
@CrossOrigin("*")
public class PhoneBookController {
	@Autowired
	private PhoneBookRepo phoneBookRepo;
	
	@PostMapping("/save")
	public PhoneNoEntity storePhoneNumber(@RequestBody PhoneNo phoneNo) {
		PhoneNoEntity noEntity = new PhoneNoEntity();
		BeanUtils.copyProperties(phoneNo, noEntity);
		 return  phoneBookRepo.save(noEntity);
	}
	@GetMapping("/get-contact")
	public List<PhoneNoEntity> getAllContact(){
		return phoneBookRepo.findAll();
	}
}
