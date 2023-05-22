package com.davidngaba.zshopuser.repositories;

import com.davidngaba.zshopuser.entities.ZshopUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ZshopUserRepository extends JpaRepository<ZshopUser, Long> {
    Optional<ZshopUser> findByEmail(String email);
}
