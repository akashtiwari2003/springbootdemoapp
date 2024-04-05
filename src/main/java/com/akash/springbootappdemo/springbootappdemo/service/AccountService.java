package com.akash.springbootappdemo.springbootappdemo.service;

import com.akash.springbootappdemo.springbootappdemo.Dto.AccountDto;


public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountById(Long id);
}
