package com.example.backend.controller;

import com.example.backend.entity.Brand;
import com.example.backend.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class BrandController {
    @Autowired
    BrandRepository brandRepository;

    @PostMapping("/api/brand")
    public ResponseEntity<Brand> saveBrand(@RequestBody Brand brand){
        return new ResponseEntity<>(brandRepository.save(brand),HttpStatus.CREATED);
    }

    @GetMapping("/api/brand")
    public  ResponseEntity<List<Brand>> getBrand() {
        return new ResponseEntity<>(brandRepository.findAll(), HttpStatus.OK);
    }
    @GetMapping("/api/brand/{id}")
    public ResponseEntity<Brand>  getBrand(@PathVariable int id) {
        Optional<Brand> brand= brandRepository.findById(id);
        if (brand.isPresent()){
            return new ResponseEntity<>(brand.get(),HttpStatus.OK);

        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }
    @DeleteMapping ("/api/brand/{id}")
    public ResponseEntity<Void> deleteBrand(@PathVariable int  id) {
        Optional<Brand> brand = brandRepository.findById(id);
        if (brand.isPresent()) {
            brandRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }


    }

}
