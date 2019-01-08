package rayene.bankaccount;
 
import junit.framework.TestCase;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {

	@Test
	public void should_add_line_with_deposit_transaction_and_balance_to_statement() {
		
		BankAccount bankaccount = new BankAccount ();
		double amount = 2000.0;
		
		bankaccount.deposit(amount);
		String date = bankaccount.getStatement().get(0).t.date;
		Transaction tr = new Transaction (date , "credit",2000.0);
		Statement st = new Statement (tr,2000.0);
		//(bankaccount.getStatement().get(0)).printStatementLine();
		//st.printStatementLine();
		assertTrue(2000.0== bankaccount.getBalance());
		assertTrue(bankaccount.getStatement().get(0).t.getType()=="credit");
		assertTrue(bankaccount.getStatement().get(0).t.getAmount()==2000.0);
	
		
	}

	@Test
	public void should_add_line_with_withdrawal_transaction_and_balance_to_statement() {

		BankAccount bankaccount = new BankAccount ();
		double amount = 2000.0;
		double withdrawalamount = 33.0;
		bankaccount.deposit(amount);
		bankaccount.withdrawal( withdrawalamount);
		String date= bankaccount.getStatement().get(0).t.date;
		Transaction tr = new Transaction (date , "debit",33.0);
		Statement st = new Statement (tr,1967.0);
		//(bankaccount.getStatement().get(0)).printStatementLine();
		//st.printStatementLine();
		assertTrue(1967.0== bankaccount.getBalance());
		assertTrue(bankaccount.getStatement().get(1).t.getType()=="debit");
	    assertTrue(bankaccount.getStatement().get(1).t.getAmount()==33.0);
	}

	@Test
	public void testPrintStatementList()
	{
	
		BankAccount bankaccount = new BankAccount ();
		double amount = 2000.0;
		double withdrawalamount = 33.0;
		bankaccount.deposit(amount);
		bankaccount.withdrawal( withdrawalamount);
		String date= bankaccount.getStatement().get(0).t.date;
		String date2= bankaccount.getStatement().get(1).t.date;
		System.out.println(bankaccount.getStatement().get(0).printStatementLine());
		assertTrue((date+"||credit||2000.0||2000.0").equals(bankaccount.getStatement().get(0).printStatementLine()));
				
		
	}
		
	

}
