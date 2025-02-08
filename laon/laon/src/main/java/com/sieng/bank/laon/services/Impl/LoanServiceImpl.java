package com.sieng.bank.laon.services.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sieng.bank.laon.entity.Loan;
import com.sieng.bank.laon.repository.LoanRepository;
import com.sieng.bank.laon.services.LoanService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LoanServiceImpl implements LoanService{
	
	private final LoanRepository loanRepository ;

	@Override
	public Loan save(Loan loan) {
		return loanRepository.save(loan);
	}

	@Override
	public List<Loan> getLoans() {
		return loanRepository.findAll();
	}

}
