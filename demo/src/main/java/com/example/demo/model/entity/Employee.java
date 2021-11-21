package com.example.demo.model.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer  employeeId;
    private String employeeName;
    private String employeeAddress;
    private String employeePhone;
    private byte gender;
    private String employeeDayOfBirth;
    private double employeeSalary;
    private boolean deleteFlag;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id",referencedColumnName = "accountId")
    @JsonManagedReference
    private Account employeeAccount;

    public Employee() {
    }

    public Employee(Integer employeeId, String employeeName, String employeeAddress, String employeePhone, byte gender, String employeeDayOfBirth, double employeeSalary, boolean deleteFlag, Account employeeAccount) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
        this.gender = gender;
        this.employeeDayOfBirth = employeeDayOfBirth;
        this.employeeSalary = employeeSalary;
        this.deleteFlag = deleteFlag;
        this.employeeAccount = employeeAccount;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public byte getGender() {
        return gender;
    }

    public void setGender(byte gender) {
        this.gender = gender;
    }

    public String getEmployeeDayOfBirth() {
        return employeeDayOfBirth;
    }

    public void setEmployeeDayOfBirth(String employeeDayOfBirth) {
        this.employeeDayOfBirth = employeeDayOfBirth;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public boolean isDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Account getEmployeeAccount() {
        return employeeAccount;
    }

    public void setEmployeeAccount(Account employeeAccount) {
        this.employeeAccount = employeeAccount;
    }
}
