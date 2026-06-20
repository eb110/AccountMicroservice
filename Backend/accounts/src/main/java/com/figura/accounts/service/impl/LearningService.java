package com.figura.accounts.service.impl;

import com.figura.accounts.dto.AccountsDto;
import com.figura.accounts.service.ILearningService;
import org.springframework.stereotype.Service;

@Service
public class LearningService implements ILearningService {
    @Override
    public AccountsDto getAccountsDto() {
        AccountsDto accountsDto = new AccountsDto();

        accountsDto.setAccountNumber(1L);
        accountsDto.setAccountType("dodo");
        accountsDto.setBranchAddress("nietuman");

        return accountsDto;
    }
}
