package com.codingshuttle.springbootwebApplication.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name="Employee")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private int age;
    private LocalDate dateofjoining;
    private Boolean isActive;


}


/* Note: whenever we create entity variable in entity class , ensure that getter setter method present in the class,
because id does not get set automatically here.
 and there is lombok maven dependency which we can use to create getter, setter and constructor method
 */