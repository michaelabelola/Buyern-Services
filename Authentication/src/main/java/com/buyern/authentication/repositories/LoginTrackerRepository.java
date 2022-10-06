package com.buyern.authentication.repositories;

import com.buyern.authentication.models.LoginTracker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginTrackerRepository extends CrudRepository<LoginTracker, Long> {

}
