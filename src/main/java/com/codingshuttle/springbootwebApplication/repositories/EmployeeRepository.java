package com.codingshuttle.springbootwebApplication.repositories;

import com.codingshuttle.springbootwebApplication.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository  extends JpaRepository<EmployeeEntity,Long> {

}


// Inside Repository we write all crud operation with the help of jpa interface
// In JpaRepository interface we have to pass two thing which is entity and type of id of entity

//Note: inside Jpa repository interface there are many method define to work crud operation on table
// like find by id , delete by id , update by id
// but if we want special method like find by name or find my mail
// we can simply add method here inside repository interface
// eg:  List<EmpoyeeEntity> getEmployeeByName(String name);  and jpa will create method automatically
