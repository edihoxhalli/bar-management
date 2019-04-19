package com.bar.barmanagement.model.entity;

import com.bar.barmanagement.domain.dto.Category;
import lombok.*;

import javax.persistence.*;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {

    @Id
    @Generated
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Category category;
    private Float price;


}
