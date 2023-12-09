package com.springjava.poc.service;

import java.util.List;
import com.springjava.poc.entity.Staff;

public interface StaffService {
    void save(Staff staff);
    List<Staff> getAll();
    Staff getById(Integer id);
    void delete(Staff staff);
}
