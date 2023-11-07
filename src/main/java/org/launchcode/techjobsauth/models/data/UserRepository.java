package org.launchcode.techjobsauth.models.data;

import jakarta.persistence.Entity;
import org.launchcode.techjobsauth.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUserName(String username);
}
