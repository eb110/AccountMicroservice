package com.figura.accounts.controller;

import com.figura.accounts.dto.AccountsDto;
import com.figura.accounts.service.ILearningService;
import com.figura.accounts.service.impl.LearningService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TestLearningController {

    private ILearningService learningService;

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/accountDto")
    public AccountsDto accountObject(){
        AccountsDto accountsDto = new AccountsDto();
        accountsDto.setAccountNumber(1L);
        accountsDto.setAccountType("dodo");
        accountsDto.setBranchAddress("nietuman");

        return accountsDto;
    }

    @GetMapping("/accountFromService")
    public AccountsDto accountFromService(){
        return learningService.getAccountsDto();
    }
}
