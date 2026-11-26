package com.example.constructioncompany.repository;

import com.example.constructioncompany.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserService extends JpaRepository<UserEntity, Long> {}
