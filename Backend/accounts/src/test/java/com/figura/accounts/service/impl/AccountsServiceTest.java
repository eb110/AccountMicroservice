package com.figura.accounts.service.impl;

import com.figura.accounts.dto.AccountsDto;
import com.figura.accounts.entity.Accounts;
import com.figura.accounts.repository.AccountsRepository;
import com.figura.accounts.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AccountsServiceTest {

    @InjectMocks
    private AccountsServiceImpl service;

    @Mock
    private AccountsRepository accountsRepository;

    @Mock
    private CustomerRepository customerRepository;

    @Test
    public void testFetchAccountsBasic() {
        when(accountsRepository.findAll()).thenReturn(List.of(new Accounts()));

        AccountsDto[] result = service.fetchAccounts();

        assertEquals(1, result.length);
    }
}
