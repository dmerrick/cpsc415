package cpsc415;

/**
 * Represents a bank account.
 * 
 * @author richards
 *
 */
public class Account {

	/**
	 * Represents the next account number.
	 */
	private static int acctNum = 0;
	
	/**
	 * Acount holders name.
	 */
	private String name;
	
	/**
	 * The account number.
	 */
	private String num;
	
	/**
	 * The amount in the account.
	 */
	private int    amount;
	
	/**
	 * Creates a new account.
	 * 
	 * @param name account holders name
	 */
	public Account(String name) {
		this.name   = name;
		this.num    = "ID" + acctNum++;
		this.amount = 0;
	}

	public static int getAcctNum() {
		return acctNum;
	}

	public String getName() {
		return name;
	}

	public String getNum() {
		return num;
	}

	public int getAmount() {
		return amount;
	}
	
	public void withdraw(String amount) {
		withdraw(Integer.parseInt(amount));
	}
	
	public void withdraw(Integer amount) {
		this.amount -= amount;
	}
	
	public void deposit(String amount) {
		deposit(Integer.parseInt(amount));
	}
	
	public void deposit(Integer amount) {
		this.amount += amount;
	}
	
	public String toString() {
		return "Account #: " + num + "; Holder's Name: " + name +
			   "; Amount: " + amount;
	}
	
}
