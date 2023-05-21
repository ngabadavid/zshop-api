package com.davidngaba.zshopuser.entities;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity(name = "ZshopUser")
@Table(
        name = "zshopuser",
        uniqueConstraints = {
                @UniqueConstraint(name="zshopuser_email_unique_constraint", columnNames = "email")
        }
)
public class ZshopUser {
    @Id
    @SequenceGenerator(
            name = "zshopuser_sequence",
            sequenceName = "zshopuser_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "zshopuser_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;
    @Column(
            name = "first_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String firstName;
    @Column(
            name = "email",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String email;
}
