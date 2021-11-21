package com.example.demo.model.repository;

import com.example.demo.model.entity.Account;
import com.example.demo.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserDetailRepository extends JpaRepository<Employee,Integer> {
    @Query(value = "select *" +
            "from employee e inner join account a on e.account_id= a.account_id" +
            " where a.user_name =?1",nativeQuery = true)
    Employee getUserDetail(@Param("name") String name);


}
