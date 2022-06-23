package com.login_registration.repository;

import java.util.Optional;

import com.login_registration.model.ERole;
import com.login_registration.model.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
