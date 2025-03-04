package zci.trainning.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zci.trainning.departmentservice.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}