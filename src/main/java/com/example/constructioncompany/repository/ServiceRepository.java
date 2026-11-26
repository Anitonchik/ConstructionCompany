package com.example.constructioncompany.repository;

import com.example.constructioncompany.entity.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<ServiceEntity, Long> {}
