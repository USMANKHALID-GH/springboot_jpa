package com.example.springjpa.businnes;

import com.example.springjpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentImplementation implements  StudentServiceInterface {
    @Autowired
    private StudentRepository studentRepository;
}
