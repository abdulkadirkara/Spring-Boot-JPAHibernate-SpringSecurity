package com.training.springboot.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.springboot.entity.Examples;


@Repository
public interface ExampleRepository extends JpaRepository<Examples, Long> {

	
}