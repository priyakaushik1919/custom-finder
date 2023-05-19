package com.learning.rest;

import com.learning.entity.StudentEntity;
import com.learning.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    public StudentEntity saveStudent(@RequestBody StudentEntity studentEntity){
       return studentService.saveStudent(studentEntity);
    }

    @GetMapping
    public List<StudentEntity> getAllStudent(){
        return  studentService.getAllStudent();
    }

    @GetMapping("/by-name/{name}")
    public List<StudentEntity> getStudentsByName(@PathVariable String name){
        return studentService.getStudentsByName(name);
    }

    @GetMapping("/by-collegeName")
    public List<StudentEntity> getStudentsByCollegeName(@RequestParam("collegeName") String collegeName){
        return studentService.getStudentsByCollegeName(collegeName);
    }
    @GetMapping("/startsWithName")
    public List<StudentEntity> getByNameStartsWith(@RequestParam("name") String name){
        return studentService.getByNameStartsWith(name);
    }
    @GetMapping("/by-nameAndCollegeName")
    public List<StudentEntity> getByNameAndCollegeName(@RequestParam("name") String name,
                                                        @RequestParam("collegeName") String collegeName){
        return studentService.getByNameAndCollegeName(name, collegeName);
    }
    @GetMapping("/by-nameContaining")
    public List<StudentEntity> getByNameContaining(@RequestParam("name") String name){
        return studentService.getByNameContaining(name);
    }
}
