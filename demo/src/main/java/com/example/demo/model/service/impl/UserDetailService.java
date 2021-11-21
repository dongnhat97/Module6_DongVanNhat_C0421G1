package com.example.demo.model.service.impl;

import com.example.demo.model.entity.Employee;
import com.example.demo.model.repository.UserDetailRepository;
import com.example.demo.model.service.IUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailService implements IUserDetailService {
    @Autowired
    UserDetailRepository userDetailRepository;
    @Override
    public Employee getUserDetail(String name) {
        return userDetailRepository.getUserDetail(name);
    }
}
