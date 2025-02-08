package com.sieng.bank.laon.services;

import java.util.List;

import com.sieng.bank.laon.entity.Loan;

public interface LoanService {
	
	Loan save(Loan loan);
	List<Loan> getLoans();
}
