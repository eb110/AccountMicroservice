package com.figura.accounts.repository;

import com.figura.accounts.entity.Accounts;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class AccountsRepositoryTest {

    @Autowired
    AccountsRepository repository;

    @Test
    public void FindAllAccountsTestBasic(){
        List<Accounts> items = repository.findAll();

        assertEquals(0, items.size());
    }
}
