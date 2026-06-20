package com.figura.accounts.controller;

import com.figura.accounts.dto.AccountsDto;
import com.figura.accounts.service.ILearningService;
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
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(TestLearningController.class)
public class HelloWorldControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private ILearningService service;

    @Test
    public void helloWorldBasic() throws Exception {
        //call GET "hello-world"
        RequestBuilder request = MockMvcRequestBuilders.get("/hello-world").accept(MediaType.APPLICATION_JSON);
        MvcResult result =  mockMvc.perform(request).andExpect(status().is(200)).andExpect(content().string("Hello World")).andReturn();

        //verify
        assertEquals("Hello World", result.getResponse().getContentAsString());
    }

    @Test
    public void accountDtoBasic() throws Exception {
        //call GET "accountDto"
        RequestBuilder request = MockMvcRequestBuilders.get("/accountDto").accept(MediaType.APPLICATION_JSON);
        MvcResult result =  mockMvc.perform(request).andExpect(status().is(200)).andReturn();

        //verify
        assertEquals("{\"accountNumber\":1,\"accountType\":\"dodo\",\"branchAddress\":\"nietuman\"}", result.getResponse().getContentAsString());
    }

    @Test
    public void accountsDtoFromServiceBasic() throws Exception {
        AccountsDto accountsDto = new AccountsDto();
        accountsDto.setAccountNumber(1L);
        accountsDto.setAccountType("dodo");
        accountsDto.setBranchAddress("nietuman");
        when(service.getAccountsDto()).thenReturn(accountsDto);

        RequestBuilder request = MockMvcRequestBuilders.get("/accountFromService").accept(MediaType.APPLICATION_JSON);
        MvcResult result =  mockMvc.perform(request).andExpect(status().is(200)).andReturn();

        assertEquals("{\"accountNumber\":1,\"accountType\":\"dodo\",\"branchAddress\":\"nietuman\"}", result.getResponse().getContentAsString());
    }
}
