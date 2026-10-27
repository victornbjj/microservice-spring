package com.devdojo.microsservice.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devdojo.microsservice.database.entity.CourseEntity;
import com.devdojo.microsservice.service.CourseService;

@RestController 
@RequestMapping ("/v1/admin/course")
public class CourseController {

    private CourseService service;
  

    @GetMapping
    public ResponseEntity<Page<CourseEntity>> list(Pageable pageable){
        return new ResponseEntity<>(service.list(pageable), HttpStatus.OK);
    }


    public CourseController (CourseService service){
        this.service = service;
    }





}
