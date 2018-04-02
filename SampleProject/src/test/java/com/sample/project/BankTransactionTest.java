package com.sample.project;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankTransactionTest {

	BankTransaction trans = new BankTransaction();
	
	AmountDTO amount = new AmountDTO();
	
	@Before
	public void before() {
		amount.setAmount(100d);
		amount.setRemarks("for test");
		trans.updateBalance(1000d);
	}
	
	@Test
	public void transactionTest() {
		Assert.assertSame("Test Success", "success", trans.debit(amount));
	}

	@Test
	public void amountNotZeroCheck(){
		Assert.assertEquals("success", trans.debit(amount));
	}
	
	@Test
	public void remarksNotNullCheck(){
		Assert.assertEquals("success", trans.debit(amount));
	}
	
	
	@Test
	public void balancesCheck(){
		Assert.assertEquals("success", trans.debit(amount));
	}
	
	@Test
	public void negativeCheck(){
		Assert.assertEquals("success", trans.debit(amount));;
	}
}
