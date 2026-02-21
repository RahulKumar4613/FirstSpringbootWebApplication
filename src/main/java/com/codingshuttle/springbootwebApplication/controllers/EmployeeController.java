package com.codingshuttle.springbootwebApplication.controllers;


import com.codingshuttle.springbootwebApplication.dTO.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {

//    @GetMapping(path="/getsecretmessage")
//    public String getSecretMessage(){
//        return "secret message: skfvsd32r24@#sdmvd";
//    }


     @GetMapping(path="/{employeeID}")
    public EmployeeDTO getEmployee(@PathVariable("employeeID") Long employeeId){

         return new EmployeeDTO(employeeId,"rahul","rahul@gmail.com",5, LocalDate.of(2026,2,20),true);
     }

     @GetMapping
     public EmployeeDTO getEmployeeById(@RequestParam(required = false) Long id,String name){

         return new EmployeeDTO(id,name,"abc@gmail.com",29,LocalDate.of(2026,2,21),true);
     }

     @PostMapping
     public String createEmployee(){

         return "Hello from Post mapping";
     }

     @PutMapping
    public String UpdateEmployee(){

         return "Hello from Put Mapping";
     }
}
