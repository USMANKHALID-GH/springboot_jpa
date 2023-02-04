package com.example.springjpa.repository;

import com.example.springjpa.entity.Guardian;
import com.example.springjpa.entity.Student;
import jakarta.persistence.Table;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
//@DataJpaTest
@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public  void saveStudent(){
        Guardian guardian=new Guardian("khalid usman","khalidusaman@gmail.com");
        Student student=Student.builder()
                .email("loftyusman@gmail18.com")
                .firstName("usman")
                .secondName("khalid")
                .password("122")
                .guardian(guardian)
                .build();
        studentRepository.save(student);

    }

    @Test
    public  void printAll(){
        List<Student> student=studentRepository.findAll();
        for(Student s:student){
            System.out.println(s);
        }
    }
    @Test
    public  void getByName(){
        List<Student> students=studentRepository.findStudentByFirstName("usman");
        for(Student s:students){
            System.out.println(s);
        }
    }
    @Test
    public  void getByEmail(){
        Student student=studentRepository.getStudentByEmail("loftyusman@gmail19.com");
        System.out.println(student);
    }

    @Test
    public  void getNmaeByEmail(){
       String student=studentRepository.getNameByEmail1("loftyusman@gmail19.com");
        System.out.println(student);
    }


}