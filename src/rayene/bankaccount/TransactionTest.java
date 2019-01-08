package rayene.bankaccount;

import static org.junit.Assert.*;

import org.junit.Test;

public class TransactionTest {

	@Test
	public void should_Print_TransactionLine() {
		String date ="08/01/19 17h04";
		Double amount = 2.0;
		String type = "credit";
		Transaction t = new Transaction (date,type,amount);
		assertTrue(("08/01/19 17h04||credit||2.0").equals(t.printTransactionLine()));
	}
}
