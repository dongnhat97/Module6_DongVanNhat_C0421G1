package com.example.demo.model.service;

import com.example.demo.model.entity.Account;
import org.springframework.data.repository.query.Param;

public interface IAccountService {
    Account getAccountById( Integer id);
    void editPassword(String password,Integer id );
}
