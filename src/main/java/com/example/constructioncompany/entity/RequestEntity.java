package com.example.constructioncompany.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class RequestEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @EqualsAndHashCode.Include
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "user_id", nullable = false)
  private UserEntity user;

  @Column(name = "name", length = 255)
  private String name;

  @Column(name = "description", length = 1000)
  private String description;

  @Column(name = "created_at")
  private LocalDateTime createdAt;

  @Column(name = "rejection_reason", length = 255)
  private String rejectionReason;

  @Enumerated(EnumType.STRING)
  @Column(name = "request_status", length = 20)
  private RequestStatus requestStatus;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(
      name = "request_service",
      joinColumns = @JoinColumn(name = "request_id"),
      inverseJoinColumns = @JoinColumn(name = "service_id"))
  private List<ServiceEntity> services = new ArrayList<>();

  @OneToOne(mappedBy = "request", cascade = CascadeType.ALL)
  private ProjectEntity project;
}
