package com.learning.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class StudentEntity {

    @Id
    private Long rollNo;
    private String name;
    private String collegeName;
    private Long contactNumber;
    private String address;
}
