package com.bucket.travelrestrictions.controllers;

import com.bucket.travelrestrictions.models.Restriction;
import com.bucket.travelrestrictions.repositories.RestrictionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/restrictions")

public class RestrictionController {

    @Autowired
    RestrictionRepository restrictionRepository;

//    List<Restriction> restrictionArrayList = new ArrayList<>();


    @GetMapping
    public List<Restriction> getAllRestrictions() {
        return restrictionRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public Restriction createRestriction(@RequestBody Restriction restriction) {


        return restrictionRepository.save(restriction);
    }



}
