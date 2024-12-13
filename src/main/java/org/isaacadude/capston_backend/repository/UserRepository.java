package org.isaacadude.capston_backend.repository;


import org.isaacadude.capston_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}