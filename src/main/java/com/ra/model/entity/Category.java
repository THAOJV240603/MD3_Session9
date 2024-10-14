package com.ra.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table (name = "categories")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "categoryName", length = 100, unique = true, nullable = false)
    private String categoryName;
    @ColumnDefault("1")
    //@Column(name = "categoryStatus", columnDefinition = "default 1")
    private boolean categoryStatus;
    @OneToMany(mappedBy = "category")
    private Set<Product> products;
}
