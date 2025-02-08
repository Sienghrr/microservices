package com.sieng.bank.laon.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Data;

@Data
public class LoanDTO {
	private long loanNumber;
	private long customerId;
	private LocalDate startDate;
	private String loanType;
	private BigDecimal totalLoan;
	private BigDecimal amountPaid;
	private BigDecimal outstandingAmount;
	private LocalDate createDate;
}
