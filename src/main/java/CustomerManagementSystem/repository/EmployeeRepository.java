package CustomerManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import CustomerManagementSystem.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}