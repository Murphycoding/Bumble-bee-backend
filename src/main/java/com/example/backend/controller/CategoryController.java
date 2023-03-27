package com.example.backend.controller;
import com.example.backend.entity.Category;
import com.example.backend.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @GetMapping("/api/category/{id}")
    public ResponseEntity<Category>  getCategory(@PathVariable int id) {
        Optional<Category> category= categoryRepository.findById(id);
        if (category.isPresent()){
            return new ResponseEntity<>(category.get(),HttpStatus.OK);

        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }
    @DeleteMapping ("/api/category/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable int id) {
        Optional<Category> category = categoryRepository.findById(id);
        if (category.isPresent()) {
            categoryRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }


}
