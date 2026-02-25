package com.codingshuttle.springbootwebApplication.service;

import com.codingshuttle.springbootwebApplication.dTO.EmployeeDTO;
import com.codingshuttle.springbootwebApplication.entities.EmployeeEntity;
import com.codingshuttle.springbootwebApplication.repositories.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {


    public final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    public EmployeeService(EmployeeRepository employeeRepository, ModelMapper modelMapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }

    public EmployeeDTO getEmployeeById(Long id) {

         EmployeeEntity employeeEntity=employeeRepository.findById(id).orElse(null);

         return modelMapper.map(employeeEntity,EmployeeDTO.class);
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

/* In Service layer we don't return Entity object , it must return a DTO Object
    for standardization.
    and to convert EmployeeEntity object to EmployeeDTO object we use ModelMapper library.
 */
