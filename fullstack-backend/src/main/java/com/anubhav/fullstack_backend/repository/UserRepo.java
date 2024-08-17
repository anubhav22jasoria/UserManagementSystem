package com.anubhav.fullstack_backend.repository;

import com.anubhav.fullstack_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
