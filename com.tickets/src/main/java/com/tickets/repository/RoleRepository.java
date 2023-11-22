package com.tickets.repository;

import com.tickets.entity.Role;
import com.tickets.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role,Long> {

    List<Role> findByUser(User user);
}
