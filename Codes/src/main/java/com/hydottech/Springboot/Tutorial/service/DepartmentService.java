package com.hydottech.Springboot.Tutorial.service;


import com.hydottech.Springboot.Tutorial.entity.Department;

import java.util.List;

public interface DepartmentService {

   public Department saveDepartment(Department department);


  public  List<Department> fetchDepartments();


  public  Department fetchOneDepartments(long id);

  public  void deleteOneDepartments(long id);


  public  Department updateDepartment(long id, Department department);


  public Department fetchDepartmentByName(String name);
}
