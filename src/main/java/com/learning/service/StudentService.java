package com.learning.service;

import com.learning.Repository.StudentRepository;
import com.learning.entity.StudentEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class StudentService {

    private  final StudentRepository studentRepository;
    public StudentEntity saveStudent(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }

    public List<StudentEntity> getAllStudent() {
        return studentRepository.findAll();
    }

    public List<StudentEntity> getStudentsByName(String name){
        return studentRepository.findByName(name);
    }

    public List<StudentEntity> getStudentsByCollegeName(String collegeName){
        return studentRepository.findByCollegeName(collegeName);
    }

    public List<StudentEntity> getByNameStartsWith(String name){
        return studentRepository.findByNameStartsWith(name);
    }

    public  List<StudentEntity> getByNameAndCollegeName(String name, String collegeName){
        return studentRepository.findByNameAndCollegeName(name, collegeName);
    }
    public List<StudentEntity> getByNameContaining(String name){
        return studentRepository.findByNameContaining(name);
    }
}
