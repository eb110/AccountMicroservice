package com.figura.accounts.controller;

import com.figura.accounts.dto.AccountsDto;
import com.figura.accounts.service.IAccountsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(AccountsController.class)
public class AccountsControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private IAccountsService service;

    @Test
    public void getAccountsTest() throws Exception {

        when(service.fetchAccounts()).thenReturn(new AccountsDto[]{new AccountsDto()});

        RequestBuilder request = MockMvcRequestBuilders.get("/api/accounts").accept(MediaType.APPLICATION_JSON);
        MvcResult result =  mockMvc.perform(request).andExpect(status().is(200)).andReturn();

        //verify
        assertEquals("[{\"accountNumber\":null,\"accountType\":null,\"branchAddress\":null}]", result.getResponse().getContentAsString());
    }
}
