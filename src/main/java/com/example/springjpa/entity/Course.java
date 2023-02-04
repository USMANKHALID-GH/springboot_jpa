package com.example.springjpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.valves.StuckThreadDetectionValve;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    @Id
    @SequenceGenerator(name = "Course_squence" ,allocationSize = 1,sequenceName ="Course_squence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "Course_squence")
    @Column(name = "Course_id")
    private  Long id;
    private String title;
    private  int credit;

    @OneToOne(mappedBy = "course")
    private  CourseMaterial courseMaterial;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "student_course_mapping", joinColumns = @JoinColumn(
            name = "course_id"
            ,referencedColumnName = "Course_id"
    ), inverseJoinColumns = @JoinColumn(
            name = "student_id",
            referencedColumnName = "student_id"
    )
            )
    List<Student> studentList;

    public  void addStudent(Student student){
    if(studentList==null) studentList= new ArrayList<>();
    studentList.add(student);
    }
}
