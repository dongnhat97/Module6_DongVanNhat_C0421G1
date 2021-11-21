package com.example.demo.model.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class EditPasswordAccountDto {
    private Integer accountId;
    @NotNull(message = "Mật khẩu không được phép để trống")
    @NotEmpty(message = "Mật khẩu không được phép để trống")
    @Size(min = 5 , max = 20 , message = "Mật khẩu phải từ 5-20 kí tự")
    @Pattern(regexp = "^[0-9a-zA-Z]+$" , message = "Mật khẩu chỉ được chứa chữ cái thường , chữ cái in hoa và số ")
    private String password;
    private String oldPassword;
    private String confirmPassword;

    public EditPasswordAccountDto() {
    }

    public EditPasswordAccountDto(Integer accountId, @NotNull(message = "Mật khẩu không được phép để trống") @NotEmpty(message = "Mật khẩu không được phép để trống") @Size(min = 5, max = 20, message = "Mật khẩu phải từ 5-20 kí tự") @Pattern(regexp = "^[0-9a-zA-Z]+$", message = "Mật khẩu chỉ được chứa chữ cái thường , chữ cái in hoa và số ") String password, String oldPassword, String confirmPassword) {
        this.accountId = accountId;
        this.password = password;
        this.oldPassword = oldPassword;
        this.confirmPassword = confirmPassword;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
