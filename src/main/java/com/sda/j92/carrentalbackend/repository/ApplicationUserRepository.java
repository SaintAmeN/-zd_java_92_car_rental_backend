package com.sda.j92.carrentalbackend.repository;

import com.sda.j92.carrentalbackend.model.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
    boolean existsByUsername(String username);
}
