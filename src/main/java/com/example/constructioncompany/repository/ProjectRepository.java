package com.example.constructioncompany.repository;

import com.example.constructioncompany.entity.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {}
