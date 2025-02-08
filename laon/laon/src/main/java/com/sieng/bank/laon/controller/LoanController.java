package com.sieng.bank.laon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sieng.bank.laon.dto.LoanDTO;
import com.sieng.bank.laon.entity.Loan;
import com.sieng.bank.laon.mapper.LoanMapper;
import com.sieng.bank.laon.services.LoanService;

@RestController
@RequestMapping("api/loans")
public class LoanController {
	
	@Autowired
	private LoanService loanService;
	@Autowired
	private LoanMapper loanMapper;
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody LoanDTO dto){
		Loan loan = loanService.save(loanMapper.toLoan(dto));		
		return ResponseEntity.status(HttpStatus.CREATED).body(loan);
	}
	
	@GetMapping
	public ResponseEntity<?> getLoans(){				
		return ResponseEntity.ok(loanService.getLoans());
	}

}
