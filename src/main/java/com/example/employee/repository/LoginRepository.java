package com.example.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employee.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long>{

	Login findAllById(int i);

	//Login findByUsernameAndpassword(String /userName,String Password);
}
