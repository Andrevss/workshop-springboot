package com.personalproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personalproject.course.Entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}


