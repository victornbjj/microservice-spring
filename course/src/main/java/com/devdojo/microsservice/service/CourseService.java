package com.devdojo.microsservice.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devdojo.core.database.entity.CourseEntity;
import com.devdojo.core.database.repository.CouseRepository;





@Service 
public class CourseService {

    private final CouseRepository repository;



   public Page<CourseEntity> list (Pageable pageable){
    return repository.findAll(pageable);
   }




    
    public CourseService(CouseRepository repository) {
        this.repository = repository;
    }

    

}
