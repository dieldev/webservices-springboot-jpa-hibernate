package com.projetoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
