
public class Accounts {
	private int acntNo;
	private String holder;
	private double balance;
	
	public Accounts () {
	}
	
	public Accounts (int acntNo, String holder, double balance) {
		this.acntNo = acntNo;
		this.holder = holder;
		this.balance = balance;
	}
	
	public void summary() {
		System.out.println("A/C No: " + acntNo);
		System.out.println("Holder: " + holder);
		System.out.println("balance: " + balance);
	
		
	}
	// BL Methods
	public void deposit (double amount) {
				balance += amount;
			}
	public void withdraw (double amount) {
		balance -= amount;
	}
	 

}
