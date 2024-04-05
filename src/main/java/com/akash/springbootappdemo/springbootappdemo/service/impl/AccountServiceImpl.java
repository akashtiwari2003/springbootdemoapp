package com.akash.springbootappdemo.springbootappdemo.service.impl;

import com.akash.springbootappdemo.springbootappdemo.Dto.AccountDto;
import com.akash.springbootappdemo.springbootappdemo.entity.Account;
import com.akash.springbootappdemo.springbootappdemo.mapper.AccountMapper;
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
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }

    @Override
    public AccountDto getAccountById(Long id) {
        Account account = accountRepository.findById(id).orElseThrow(() -> new RuntimeException("Account does not exist"));
        return AccountMapper.mapToAccountDto(account);
    }
}
