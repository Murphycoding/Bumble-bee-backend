package com.example.backend.controller;

import com.example.backend.entity.Category;
import com.example.backend.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    CategoryRepository categoryRepository;

    @PostMapping("/api/category")
    public ResponseEntity<Category> saveCategory(@RequestBody Category Category){
        return new ResponseEntity<> (categoryRepository.save(Category), HttpStatus.CREATED);
    }

    @GetMapping("/api/category")
    public  ResponseEntity<List<Category>> getCategory() {
        return new ResponseEntity<>(categoryRepository.findAll(), HttpStatus.OK);
    }


}
