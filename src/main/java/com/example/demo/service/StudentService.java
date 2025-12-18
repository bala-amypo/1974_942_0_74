package com.example.PracticeProject.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PracticeProject.entity.StuEnt;
import com.example.PracticeProject.repository.StudentRepository;
import com.example.PracticeProject.service.StudentService;

@Service
public class StudentServiceImplement implements StudentService{
    
    @Autowired
    StudentRepository studentRepository;

    public StuEnt saveStudent(StuEnt student){
        return studentRepository.save(student);
    }
}