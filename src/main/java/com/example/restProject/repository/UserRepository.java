package com.example.restProject.repository;

import com.example.restProject.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

}
