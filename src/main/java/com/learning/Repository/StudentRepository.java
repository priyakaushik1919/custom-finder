package com.learning.Repository;

import com.learning.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
    List<StudentEntity> findByName(String name);

    List<StudentEntity> findByCollegeName(String collegeName);

    List<StudentEntity> findByNameAndCollegeName(String name, String collegeName);

    List<StudentEntity> findByNameStartsWith(String name);

    List<StudentEntity> findByNameContaining(String name);
}
