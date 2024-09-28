package com.example.springdata.jpqlAndNativesql.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.springdata.jpqlAndNativesql.entities.User;

public interface SubscriptionRepository extends CrudRepository<User, Long> {

}
