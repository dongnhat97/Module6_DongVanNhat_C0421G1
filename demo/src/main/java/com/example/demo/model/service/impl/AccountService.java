package com.example.demo.model.service.impl;

import com.example.demo.model.entity.Account;
import com.example.demo.model.repository.AccountRepository;
import com.example.demo.model.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements IAccountService {
    @Autowired
    AccountRepository accountRepository;


    @Override
    public Account getAccountById(Integer id) {
        return accountRepository.getAccountById(id);
    }

    @Override
    public void editPassword(String password, Integer id) {
        accountRepository.editPassword(password,id);
    }


}
