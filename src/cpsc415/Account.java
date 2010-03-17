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
    trans = new LinkedList<Transaction>();
	}

	/**
	 * Returns the account number.
	 */
	public static int getAcctNum() {
		return acctNum;
	}

	/**
	 * Returns the account name.
	 */
	public String getName() {
		return client.getName();
	}

	/**
	 * Returns the account number.
	 */
	public String getNum() {
		return num;
	}

	/**
	 * Returns the amount of funds in the account.
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * Returns the client object.
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * Sets the address to a new value.
   *
   * @param address the address
	 */
  public void setAddress(String address) {
    client.setAddress(address);
  }
	
	/**
	 * Sets the telephone number to a new value.
   *
   * @param telephone the number
	 */
  public void setTelephone(String telephone) {
    client.setTelephone(telephone);
  }
	
	/**
	 * Sets the email address to a new value.
   *
   * @param email the address
	 */
  public void setEmail(String email) {
    client.setEmail(email);
  }
	
	/**
	 * Removes funds from the account as a string.
   *
   * @param amount the amount of funds
	 */
	public void withdraw(String amount) {
		withdraw(Integer.parseInt(amount));
	}

	/**
	 * Removes funds from the account as an integer.
   *
   * @param amount the amount of funds
	 */
	public void withdraw(Integer amount) {
		this.amount -= amount;
	}
	
	/**
	 * Adds funds to the account as a string.
   *
   * @param amount the amount of funds
	 */
	public void deposit(String amount) {
		deposit(Integer.parseInt(amount));
	}
	
	/**
	 * Adds funds to the account as an integer.
   *
   * @param amount the amount of funds
	 */
	public void deposit(Integer amount) {
		this.amount += amount;
	}
	
	/**
	 * Adds a new transaction to the account.
   *
   * @param t the transaction
	 */
  public String addTransaction( Transaction t ) {
    trans.add(t);

    return t.toString();
  }

	/**
	 * Returns the list of transactions for the account.
	 */
  public List<Transaction> getTransactions() {
    return this.trans;
  }

	/**
	 * Returns a String version of the object.
	 */
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
