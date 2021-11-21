package com.example.demo.controller;

import com.example.demo.model.entity.Employee;
import com.example.demo.model.service.IUserDetailService;
import net.bytebuddy.implementation.bind.annotation.Origin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/userDetail")
public class UserDetailController {
    @Autowired
    IUserDetailService iUserDetailService;
    @GetMapping()
    public ResponseEntity<Employee> findUserDetail(@RequestParam("name") String name) {
        Employee employee = iUserDetailService.getUserDetail(name);
        if (employee!=null) {
            return new ResponseEntity<>(employee, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

    }
}
