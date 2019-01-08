package rayene.bankaccount;

import java.util.ArrayList;


public class Transaction {
	
	private String type ;
	private double amount ;
	String date;
	
	public  Transaction ()
	{
	}
	public Transaction (String date ,String type, double amount )
	{
		this.date = date ;
		this.type = type;
		this.amount = amount ; 
	}
	
	
	
		
		public String printTransactionLine ( ) {
				
			String transactionLine = (date+"||"+type+"||"+amount);
		
				return transactionLine ;
	}
	
	
	
		
		
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}




	