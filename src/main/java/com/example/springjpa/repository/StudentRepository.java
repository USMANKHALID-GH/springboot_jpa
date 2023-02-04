package com.example.springjpa.repository;

import com.example.springjpa.entity.Student;
import jakarta.websocket.server.PathParam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository  extends JpaRepository<Student , Long> {
    List<Student> findStudentByFirstName(String name);
    List<Student> findStudentByFirstNameContaining(String name);
    List<Student> findStudentBySecondNameNotNull();
//    jpql
    @Query("select s from Student s where s.email=?1")
    Student getStudentByEmail(String email);

//    NATIVE QUERY
    @Query(
            value = "select first_name from tbl_student where student_email=?1 ",
            nativeQuery = true
    )
    String getNameByEmail(String email);

//    named param
@Query(
        value = "select first_name from tbl_student where student_email=:email ",
        nativeQuery = true
)
String getNameByEmail1(@PathParam("email") String email);
}
