package com.example.homework65.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products_table")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 128)
    private String name;
    @Column(length = 128)
    private String image;

    @Column
    private float price;
    @ManyToOne(fetch = FetchType.LAZY)
    private Place place;
}
