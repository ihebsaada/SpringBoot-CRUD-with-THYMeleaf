package com.springjava.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springjava.poc.entity.Staff;
public interface StaffRepo extends JpaRepository<Staff, Integer> {

}
