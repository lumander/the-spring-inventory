package com.ibm.garage.warehouse.repositories;

import com.ibm.garage.warehouse.models.Availability;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface AvailabilityRepository extends CrudRepository<Availability, Integer> {

}