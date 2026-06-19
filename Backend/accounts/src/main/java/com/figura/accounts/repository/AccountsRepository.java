package com.figura.accounts.repository;

import com.figura.accounts.entity.Accounts;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {
    Optional<Accounts> findByCustomerId(Long customerId);

    //change of data!!!
    //Transactional will roll back in case of an issue
    @Transactional
    @Modifying
    void deleteByCustomerId(Long customerId);
}
