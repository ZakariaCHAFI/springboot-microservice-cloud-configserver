package zci.trainning.departmentservice.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import zci.trainning.departmentservice.entity.Department;
import zci.trainning.departmentservice.repository.DepartmentRepository;
import zci.trainning.departmentservice.service.DepartmentService;

import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department getDepartmentById(Long departmentId) {
        Optional<Department> department = departmentRepository.findById(departmentId);
        return departmentRepository.findById(departmentId).get();
    }
}
