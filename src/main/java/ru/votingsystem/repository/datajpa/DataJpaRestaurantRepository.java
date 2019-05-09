package ru.votingsystem.repository.datajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DataJpaRestaurantRepository {

    @Autowired
    private CrudRestaurantRepository repository;


}
