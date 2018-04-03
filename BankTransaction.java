package com.sample.project;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class BankTransaction {

	double balance = 0d;

	public String debit(AmountDTO amount) {
		if (balance == 0d || amount.getAmount() < 0d
				|| amount.getAmount() == 0d || amount.getRemarks() == null
				|| balance < 0d) {
			return "failed";
		}
		balance = balance - amount.getAmount();
		return "success";
	}

	public void updateBalance(double newBalanace) {
		balance = balance + newBalanace;
	}
}
