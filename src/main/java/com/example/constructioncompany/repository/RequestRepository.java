package com.example.constructioncompany.repository;

import com.example.constructioncompany.entity.RequestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<RequestEntity, Long> {}
