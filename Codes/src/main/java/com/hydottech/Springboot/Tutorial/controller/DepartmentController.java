package com.hydottech.Springboot.Tutorial.controller;

import com.hydottech.Springboot.Tutorial.entity.Department;
import com.hydottech.Springboot.Tutorial.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@ModelAttribute Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartments(){
        return departmentService.fetchDepartments();
    }

    @GetMapping("/departments/{Id}")
    public Department fetchOneDepartment(@PathVariable("Id") long Id){
        return departmentService.fetchOneDepartments(Id);
    }

    @DeleteMapping("/departments/{Id}")
    public String deleteOneDepartment(@PathVariable("Id") long Id){
        departmentService.deleteOneDepartments(Id);
        return "Department deleted successfully";
    }

    @PutMapping("/departments/{Id}")
    public Department updateDepartment(@PathVariable("Id") long Id, @ModelAttribute Department department){
        return departmentService.updateDepartment(Id, department);
    }

    @GetMapping("/departmentsName/{Name}")
    public Department fetchDepartmentByName(@PathVariable("Name") String Name){
        return departmentService.fetchDepartmentByName(Name);
    }






}
