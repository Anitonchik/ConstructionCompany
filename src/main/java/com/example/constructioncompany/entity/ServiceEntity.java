package com.example.constructioncompany.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.math.BigDecimal;
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
public class ServiceEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @EqualsAndHashCode.Include
  private Long id;

  @Column(name = "name", length = 255)
  private String name;

  @Column(name = "description", length = 1000)
  private String description;

  @Column(name = "price", precision = 10, scale = 2)
  private BigDecimal price;

  @Column(name = "duration_days")
  private Integer durationDays;

  @Column(name = "created_at")
  private LocalDateTime createdAt;

  @ManyToMany(mappedBy = "services")
  private List<RequestEntity> requests = new ArrayList<>();
}
