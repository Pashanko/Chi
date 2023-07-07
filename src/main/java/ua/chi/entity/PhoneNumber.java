package ua.chi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "phone_numbers")
@Data
public class PhoneNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String phoneNumber;

}