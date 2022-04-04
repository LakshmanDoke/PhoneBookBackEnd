package com.laksh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laksh.entities.PhoneNoEntity;

public interface PhoneBookRepo extends JpaRepository<PhoneNoEntity, Long>{

}
