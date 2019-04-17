package com.bar.barmanagement.model.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {

    @Id
    @Generated
    private Long id;
    private String name;
    private Category category;
    private Float price;

    enum Category{
        ALCOHOOLIC, ANALCOHOOLIC, CAFFEINE
    }
}
