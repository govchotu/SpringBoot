package com.nt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nt.entity.Doctor;
@Repository
public interface IDoctorRepo extends CrudRepository<Doctor, Integer> {

}
