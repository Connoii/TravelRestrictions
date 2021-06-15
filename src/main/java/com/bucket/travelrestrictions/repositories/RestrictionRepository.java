package com.bucket.travelrestrictions.repositories;

import com.bucket.travelrestrictions.models.Restriction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestrictionRepository extends JpaRepository<Restriction, Long> {
}
