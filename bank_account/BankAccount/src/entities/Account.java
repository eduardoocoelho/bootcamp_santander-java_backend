package entities;

public class Account {
	private Integer number;
	private String agency;
	private String name;
	private Float balance;

	
	public Account(Integer number, String agency, String name, Float balance) {
		this.number = number;
		this.agency = agency;
		this.name = name;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getBalance() {
		return balance;
	}

	public void setBalance(Float balance) {
		this.balance = balance;
	}

	
	@Override
	public String toString() {
		return "Hello " + this.getName() +  
				", thanks for opening an account in our bank, your agency is " + 
				this.getAgency() + ", \naccount " + this.getNumber() + 
				" and your balance $" + this.getBalance() + 
				" is already available for withdraw.";
	}
}
