package com.sieng.bank.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.sieng.bank.account.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
