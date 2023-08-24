package model.entities;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double limit;
	
	public Account(Integer number, String holder, Double balance, Double limit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.limit = limit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getLimit() {
		return limit;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		if(amount > limit) {
			System.out.println("error");
		}
		else {
			this.balance -= amount;
		}		
	}
	
	
	

}
