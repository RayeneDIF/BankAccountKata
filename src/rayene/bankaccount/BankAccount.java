package rayene.bankaccount;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class BankAccount {
	
	private double balance ; 
	
	private ArrayList <Statement> statement;
	
	
	public  BankAccount() {
		
   		balance = 0.0;
   		statement = new ArrayList<Statement> ();
   		}
	
	
	public void  deposit (double depositAmount) {
		
		if (depositAmount > 0.0)
		{
			
			
			balance+= depositAmount ;
			Date d = new Date (); 
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH'h'mm");
			Transaction t= new Transaction (dateFormat.format(d),"credit",depositAmount);
			Statement statementAfterDeposit = new Statement (t,balance );
			statement.add(statementAfterDeposit);
		}
		else
		{
			System.out.println("negatif deposit amount");
			
		}
		
		
	}
		
		
		public void withdrawal (double withdrawalAmount) {
			
			if  (withdrawalAmount > 0  && withdrawalAmount <= balance)  {
			
			balance-= withdrawalAmount ;
			Date d = new Date (); 
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH'h'mm");
			Transaction t= new Transaction (dateFormat.format(d),"debit",withdrawalAmount);
			Statement  statementAfterWithdrawel= new Statement (t,balance ); 
			statement.add(statementAfterWithdrawel);
			
		}
			else
			{
				System.out.println("inssuficient balance ");
			}
	}
	
		public void printStatementList () {
			
			
			System.out.println("date||operation||amount||balance");
				for(Statement s : statement) 
					
				s.printStatementLine();
					
				}


		public double getBalance() {
			return balance;
		}


		public void setBalance(double balance) {
			this.balance = balance;
		}


		public ArrayList<Statement> getStatement() {
			return statement;
		}


		public void setStatement(ArrayList<Statement> statement) {
			this.statement = statement;
		}


}
