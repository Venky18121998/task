package com.userrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import com.userentity.UserEntity;

import jakarta.transaction.Transactional;

@RestController
@Transactional
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
