package com.example.springjpa.repository;

import com.example.springjpa.entity.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CourseRepoTest {
    @Autowired
    private  CourseRepo courseRepo1;
    @Test
    public  void  save()
    {
        List<Course> courses = courseRepo1.findAll();
        System.out.println(courses);
    }

}