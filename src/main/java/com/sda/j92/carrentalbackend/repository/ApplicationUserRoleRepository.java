package com.sda.j92.carrentalbackend.repository;

import com.sda.j92.carrentalbackend.model.ApplicationUser;
import com.sda.j92.carrentalbackend.model.ApplicationUserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ApplicationUserRoleRepository extends JpaRepository<ApplicationUserRole, Long> {
    boolean existsByName(String name);
    Optional<ApplicationUserRole> findByName(String name);
}
