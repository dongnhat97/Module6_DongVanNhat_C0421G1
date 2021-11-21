package com.example.demo.model.dto;

import com.example.demo.model.entity.Employee;

public class AccountDto {
    private Integer accountId;
    private String email;
    private String userName;
    private String password;
    private boolean deleteFlag;
    private Employee employee;

    public AccountDto() {
    }

    public AccountDto(Integer accountId, String email, String userName, String password, boolean deleteFlag, Employee employee) {
        this.accountId = accountId;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.deleteFlag = deleteFlag;
        this.employee = employee;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
