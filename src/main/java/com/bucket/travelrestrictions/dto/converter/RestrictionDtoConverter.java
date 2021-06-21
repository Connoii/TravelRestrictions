package com.bucket.travelrestrictions.dto.converter;

import com.bucket.travelrestrictions.models.Restriction;

public class RestrictionDtoConverter {

    public static Restriction toRestrictionModel(Restriction restriction) {
        final Restriction updatedRestriction = new Restriction();
        updatedRestriction.setName(restriction.getName());
        updatedRestriction.setLocation(restriction.getLocation());
        return updatedRestriction;
    }

    public static Restriction fromRestrictionModel(Restriction restriction) {
        final Restriction restrictionDto = new Restriction();
        restrictionDto.setId(restriction.getId());
        restrictionDto.setName(restriction.getName());
        restrictionDto.setLocation(restriction.getLocation());
        return restrictionDto;
    }
}
