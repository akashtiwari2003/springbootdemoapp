package com.akash.springbootappdemo.springbootappdemo.repository;

import com.akash.springbootappdemo.springbootappdemo.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
