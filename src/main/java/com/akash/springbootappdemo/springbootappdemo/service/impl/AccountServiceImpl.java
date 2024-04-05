package com.akash.springbootappdemo.springbootappdemo.service.impl;

import com.akash.springbootappdemo.springbootappdemo.Dto.AccountDto;
import com.akash.springbootappdemo.springbootappdemo.repository.AccountRepository;
import com.akash.springbootappdemo.springbootappdemo.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        return null;
    }
}
