package com.project.studentgradingsystem.model;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@ToString
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "StudentTable",
        uniqueConstraints = {
                @UniqueConstraint(name = "idConstraintName", columnNames = {"id"})
                ,@UniqueConstraint(name = "emailConstraint", columnNames = {"email"})
        }
        , schema = "LEGENDARY POTATO"
)
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Sequence_Generator_Name")
    @SequenceGenerator(name = "Sequence_Generator_Name", sequenceName = "SequenceName", allocationSize = 1)
    private long id;
    @Column(nullable = false, name = "Student Name")
    private String name;
    private String email;
    @Column(name = "Death Of Birth")
    private LocalDate dob;
    private Integer age;
}