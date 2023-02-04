package com.example.springjpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    @Id
    @SequenceGenerator(name = "Teacher_squence" ,allocationSize = 1,sequenceName ="Teacher_squence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "Teacher_squence")
    @Column(name = "Teacher_id")
    private Long teacherId;
    private String firstName;
    private String lastName;
    private String password;
    private String email;

    @OneToMany(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "Teacher_id",
            referencedColumnName ="Teacher_id"
    )

    private List<Course> course;

}
