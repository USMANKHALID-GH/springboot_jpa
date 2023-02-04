package com.example.springjpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_student" ,
        uniqueConstraints =
        @UniqueConstraint(name = "student_email_unique",columnNames = "student_email"))
public class Student{
   @Id
   @SequenceGenerator(name = "student_squence" ,allocationSize = 1,sequenceName ="student_squence")
   @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "student_squence")
   @Column(name = "student_id")
    private  Long id;
    private String firstName;
    private String secondName;
    @Column(name = "student_email" ,nullable = false)
    private  String  email;
    private String password;

    @Embedded
    private  Guardian guardian;
}
