package com.example.springjpa.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude ="course")
public class CourseMaterial {
    @Id
    @SequenceGenerator(name = "CourseMaterial_squence" ,allocationSize = 1,sequenceName ="CourseMaterial _squence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "CourseMaterial_squence")
    @Column(name = "CourseMaterial_id")
    private Long courseMaterialId;
    private  String url;

    @OneToOne(cascade = CascadeType.ALL
    , fetch = FetchType.LAZY
    ,optional = false)
    @JoinColumn(
            name = "course_id",
            referencedColumnName = "Course_id"
    )
    private  Course course;
}
