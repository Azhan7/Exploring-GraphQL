package com.graphql.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Book")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String desc;
    private String author;
    private Double price;
    private Integer pages;
}
