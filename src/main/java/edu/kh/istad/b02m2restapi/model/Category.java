package edu.kh.istad.b02m2restapi.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="y2m2_categories")
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 30, nullable = false)
    private String name;
    @Column(length =255, nullable = false)
    private String icon;

    @OneToMany(mappedBy = "category")
    private List<Product> products;


}
