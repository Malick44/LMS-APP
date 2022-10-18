package com.repository;

import com.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AppUserRepository extends JpaRepository<AppUser, Integer> {
    Optional<AppUser> findByUserId(Integer userId);

    Optional<AppUser> findByUserName(String userName);


}