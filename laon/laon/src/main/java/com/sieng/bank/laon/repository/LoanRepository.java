package com.sieng.bank.laon.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sieng.bank.laon.entity.Loan;

public interface LoanRepository extends MongoRepository<Loan, Long>{

}
