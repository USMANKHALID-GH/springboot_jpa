package com.example.springjpa.repository;

import com.example.springjpa.entity.Course;
import com.example.springjpa.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMaterialRepoTest {


    @Autowired
    private  CourseMaterialRepo courseMaterialRepo;
    @Test
    public  void  save()
    {
        Course course=Course.builder()
                .credit(4)
                .title("MAT")
                .build();


        CourseMaterial courseMaterial=CourseMaterial
                .builder()
                .url("agfsghfg")
                .course(course)
                .build();
        courseMaterialRepo.save(courseMaterial);

    }

                @Test
    public  void getAll(){
        List<CourseMaterial> courseMaterialList =courseMaterialRepo.findAll();
                    System.out.println(courseMaterialList);
                }

}