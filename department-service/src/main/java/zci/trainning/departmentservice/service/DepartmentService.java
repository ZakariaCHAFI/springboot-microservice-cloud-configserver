package zci.trainning.departmentservice.service;

import zci.trainning.departmentservice.entity.Department;

public interface DepartmentService {

    Department saveDepartment(Department department);
    Department getDepartmentById(Long departmentId);
}
