package com.datmt.jpa2.repository;

import com.datmt.jpa2.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, Long> {
}