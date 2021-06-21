package com.bucket.travelrestrictions.controllers;

import com.bucket.travelrestrictions.dto.converter.RestrictionDtoConverter;
import com.bucket.travelrestrictions.models.Restriction;
import com.bucket.travelrestrictions.repositories.RestrictionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api/v1/restrictions")

public class RestrictionController {

    @Autowired
    RestrictionRepository restrictionRepository;

//    List<Restriction> restrictionArrayList = new ArrayList<>();


    @GetMapping
    public List<Restriction> getAllRestrictions() {
        return restrictionRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Restriction> getRestriction(@PathVariable("id") long id) {
        return restrictionRepository.findById(id);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Restriction updateRestriction(@RequestBody Restriction restriction) {
        Restriction updated = RestrictionDtoConverter.toRestrictionModel(restriction);
        Optional<Restriction> oldRestriction = restrictionRepository.findById(restriction.getId());
        Restriction newRestriction = oldRestriction.get();
        newRestriction.setName(restriction.getName());
        newRestriction.setLocation(restriction.getLocation());
        return restrictionRepository.save(newRestriction);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Restriction deleteRestriction(@PathVariable("id") Long id) {
        Restriction deletedRestriction = restrictionRepository.getById(id);
        restrictionRepository.deleteById(deletedRestriction.getId());
        return RestrictionDtoConverter.fromRestrictionModel(deletedRestriction);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public Restriction createRestriction(@RequestBody Restriction restriction) {
        return restrictionRepository.save(restriction);
    }



}
