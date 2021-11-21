package com.example.demo.model.repository;

import com.example.demo.model.entity.Account;
import com.example.demo.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AccountRepository extends JpaRepository<Account,Integer> {
    @Query(value = "select *" +
            "from account a " +
            " where a.account_id =?1",nativeQuery = true)
    Account getAccountById(@Param("id") Integer id);



    @Query(value = "update account set password = ?1" + "where account_id = ?2", nativeQuery = true)
    void editPassword(String password,Integer id );
}
