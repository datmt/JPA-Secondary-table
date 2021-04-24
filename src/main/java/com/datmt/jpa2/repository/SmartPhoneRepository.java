package com.datmt.jpa2.repository;

import com.datmt.jpa2.entity.SmartPhone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SmartPhoneRepository extends JpaRepository<SmartPhone, Long> {
}