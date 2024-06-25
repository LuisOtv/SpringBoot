package com.awsudemy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.awsudemy.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
