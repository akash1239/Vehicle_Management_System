package com.vms.vmsapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vms.vmsapp.models.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
