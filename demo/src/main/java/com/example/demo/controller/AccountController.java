package com.example.demo.controller;

import com.example.demo.model.dto.AccountDto;
import com.example.demo.model.dto.EditPasswordAccountDto;
import com.example.demo.model.entity.Account;
import com.example.demo.model.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/account")
public class AccountController {
 @Autowired
 IAccountService accountService;
    @GetMapping(value = "/{accountId}")
    public ResponseEntity<Account> editPassword (@PathVariable Integer accountId ) {
        Account account = accountService.getAccountById(accountId);
        if (account == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>( account,HttpStatus.OK);
        }
    }


//    @PatchMapping(value = "/editPass/{id}" , consumes = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<String> editPassword (@RequestBody AccountDto accountDto,
//                                                @PathVariable  Integer id
//                                                ) {
//
//        Account account = accountService.getAccountById(id);
//        System.out.println(accountDto.getPassword());
//        if (accountDto.getPassword().equals(account.getPassword())) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }else {
//            accountService.editPassword(id,accountDto.getPassword());
//            return new ResponseEntity<>(HttpStatus.OK);
//        }
//    }
@PatchMapping( value = "/editPass" , consumes = MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<String> editPassword (@RequestBody @Valid
                                            AccountDto accountDto , BindingResult bindingResult) {
//    Integer id = editPasswordAccountDto.getAccountId();
//    Account account = accountService.getAccountById(id);

        accountService.editPassword( accountDto.getPassword(),accountDto.getAccountId());
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
