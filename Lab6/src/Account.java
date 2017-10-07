
public class Account {
	protected int account_num;
	protected double account_balance;
	protected int totalOrders;
	protected Order[] previousOrders;
	protected String password;
	
	public String getPass() {
		return password;
	}
	
	public int getAccountNum() {
		return account_num;
	}
	
	public double getBalance() {
		return account_balance;
	}
	
	public int getTotalOrders() {
		return totalOrders;
	}
	
	public Order[] getPrevOrders() {
		return previousOrders;
	}
}
