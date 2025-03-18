package com.personalproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personalproject.course.Entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}


