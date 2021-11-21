package com.example.demo.model.service;

import com.example.demo.model.entity.Employee;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface IUserDetailService {
    Employee getUserDetail( String name);
}
