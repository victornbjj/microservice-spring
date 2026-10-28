package com.devdojo.microsservice.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.devdojo.microsservice.database.entity.CourseEntity;


public interface CouseRepository extends JpaRepository<CourseEntity, Long> {

}
