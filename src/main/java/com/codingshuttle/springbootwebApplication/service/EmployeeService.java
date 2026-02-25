package com.codingshuttle.springbootwebApplication.service;

import com.codingshuttle.springbootwebApplication.entities.EmployeeEntity;
import com.codingshuttle.springbootwebApplication.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {


    public final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeEntity getEmployeeById(Long id) {

        return employeeRepository.findById(id).orElse(null);
    }

    public List<EmployeeEntity> getAllEmployee() {

        return employeeRepository.findAll();
    }

  public EmployeeEntity createEmployee(EmployeeEntity inputEmp){

         return employeeRepository.save(inputEmp);
  }

    public List<EmployeeEntity> createAllEmployee(List<EmployeeEntity> allEmpobj)
    {
         return employeeRepository.saveAll(allEmpobj);
    }
}
