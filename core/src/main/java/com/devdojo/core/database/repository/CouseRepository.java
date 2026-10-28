package com.devdojo.core.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devdojo.core.database.entity.CourseEntity;



public interface CouseRepository extends JpaRepository<CourseEntity, Long> {

}
