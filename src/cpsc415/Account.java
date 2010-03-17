package cpsc415;

import java.util.List;
import java.util.LinkedList;

/**
 * Represents a bank account.
 */
public class Account {

	/**
	 * Represents the next account number.
	 */
	private static int acctNum = 0;
	
	/**
	 * Acount holder client object.
	 */
	private Client client;
	
	/**
	 * The account number.
	 */
	private String num;
	
	/**
	 * The amount in the account.
	 */
	private int amount;
	
	/**
	 * The list of transactions.
	 */
	private List<Transaction> trans;
	
	/**
	 * Creates a new account.
	 * 
	 * @param name account holders name
	 */
	public Account(String name) {
		this.client = new Client(name);
		this.num    = "ID" + acctNum++;
		this.amount = 0;

    // initialize the transaction list
    trans = new LinkedList();
	}

	public static int getAcctNum() {
		return acctNum;
	}

	public String getName() {
		return client.toString();
	}

	public String getNum() {
		return num;
	}

	public int getAmount() {
		return amount;
	}

	public Client getClient() {
		return client;
	}

  public void setAddress(String address) {
    client.setAddress(address);
  }
	
  public void setTelephone(String telephone) {
    client.setTelephone(telephone);
  }
	
  public void setEmail(String email) {
    client.setEmail(email);
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
	
  public String addTransaction( Transaction t ) {
    trans.add(t);

    return t.toString();
  }

	public String toString() {
    StringBuilder ret = new StringBuilder();

    ret.append("Account Number: ")
       .append(num)
       .append("<br />Name: ")
       .append(this.getName())
       .append("<br />Amount: ")
       .append(amount);

		return ret.toString();
	}
	
}
