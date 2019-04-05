package com.example.demo.REPOSITORY;

import com.example.demo.MODELS.Employee;
import com.example.demo.MODELS.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee,Integer> {
    @Query(
            value = "SELECT e.id ,e.first_name,e.last_name,e.salary," +
                    "c.id,c.certificate_name,c.employee_id" +
                    " FROM employee e " +
                    "INNER JOIN certificate c" +
                    " ON " +
                    "e.id=c.employee_id",
            nativeQuery = true)
    Iterable <Employee> findcustomeQueryEmployee();
}
