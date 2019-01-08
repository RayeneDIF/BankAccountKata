package rayene.bankaccount;

import static org.junit.Assert.*;

import org.junit.Test;

public class StatementTest {

	@Test
	public void should_print_statement_line() {
		String date ="08/01/19 17h04";
		Double amount = 2.0;
		String type = "credit";
		Double balance = 2000.0;
		Transaction t = new Transaction (date,type,amount);
		Statement statement = new Statement (t,balance);
		assertTrue(("08/01/19 17h04||credit||2.0||2000.0").equals(statement.printStatementLine()));
	}

}
