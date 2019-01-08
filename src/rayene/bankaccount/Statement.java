package rayene.bankaccount;
import java.util.ArrayList;


public class Statement {
	
	
	double balance ;
	Transaction t   ; 
	
	
	public Statement ( Transaction t, Double balance)
	{
		this.balance = balance ;
		this.t = t;
		
		
	}
	
	
	public String  printStatementLine() {
		
		String statementLine= (t.printTransactionLine ()+"||"+balance);
		
		return statementLine;
	}
	
	
		














	
	
}

