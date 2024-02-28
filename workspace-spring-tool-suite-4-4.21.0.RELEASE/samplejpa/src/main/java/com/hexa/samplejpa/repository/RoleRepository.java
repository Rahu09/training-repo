package com.hexa.samplejpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexa.samplejpa.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}