package edu.kh.istad.b02m2restapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "y2m2_customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(length = 12, nullable = false, unique = true)
    private String phoneNumber;
    @Column(length = 30, nullable = false, unique = true)
    private String email;
    @Column(length = 50, nullable = false)
    private String address;
    @Column(nullable = false)
    private Boolean isDeleted;

    @OneToOne
    private User users;

}
