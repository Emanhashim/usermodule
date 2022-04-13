package com.usermodule.repository;

import java.util.Optional;

import com.usermodule.models.ERole;
import com.usermodule.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
