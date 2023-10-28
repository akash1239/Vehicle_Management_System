package com.vms.vmsapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vms.vmsapp.models.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
