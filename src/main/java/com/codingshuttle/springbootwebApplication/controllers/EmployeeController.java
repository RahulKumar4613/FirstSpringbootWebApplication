package com.codingshuttle.springbootwebApplication.controllers;

import com.codingshuttle.springbootwebApplication.entities.EmployeeEntity;
import com.codingshuttle.springbootwebApplication.repositories.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {

   private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

      @GetMapping(path= "/{EmpID}")
      public EmployeeEntity getEmployeeById(@PathVariable(name = "EmpID") Long Id){
           return  employeeRepository.findById(Id).orElse(null);
      }

      @GetMapping
      public List<EmployeeEntity> getAllEmployee(){
          return employeeRepository.findAll();
      }

      @PostMapping
      public EmployeeEntity createEmployee(@RequestBody EmployeeEntity inputEmp)
      {
           return employeeRepository.save(inputEmp);
      }

      @PostMapping("/bulkcreation")
      public List<EmployeeEntity> createAllEmployee(@RequestBody List<EmployeeEntity> allEmpobj){

              return employeeRepository.saveAll(allEmpobj);
      }


}

/*  Note: In controller layer we directly do not connect or use repository interface.
*  we use EntityService Class for Crud Operation
* and in controller layer we always deal with dto object either to fetch or create data.
*  */
