package com.anderson.core.repository;

import org.springframework.data.repository.CrudRepository;
import com.anderson.api.api.pojo.User;

public interface UserRepository extends CrudRepository<User, Long> {

}

