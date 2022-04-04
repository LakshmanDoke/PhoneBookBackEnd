package com.laksh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laksh.entities.PhoneNoEntity;

import java.util.List;

public interface PhoneBookRepo extends JpaRepository<PhoneNoEntity, Long>{

    List<PhoneNoEntity> findByPhoneNumber(Long phoneNumber);
}
