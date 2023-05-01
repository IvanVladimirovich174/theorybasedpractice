package com.mapstruct.mapstruct.repository;

import com.mapstruct.mapstruct.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}