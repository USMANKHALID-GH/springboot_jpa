package com.example.springjpa.repository;

import com.example.springjpa.entity.Course;
import com.example.springjpa.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TeacherRepoTest {
    @Autowired
    private  TeacherRepo teacherRepo;

    @Test
    public  void save(){
        Teacher teacher=Teacher.builder()
                .email("usmankhalid.com")
                .firstName("usman")
                .lastName("khalid")
                .password("2333")
                .course(List.of(Course.builder()
                                .title("PHY").
                        build(),Course.builder()
                        .title("COMP-1").
                        build() )


                ).build();

        teacherRepo.save(teacher);
    }

}