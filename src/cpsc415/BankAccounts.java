package cpsc415;

import java.util.ArrayList;
import java.util.List;

/**
 * A collection of all bank accounts.
 * 
 * @author richards
 *
 */
public enum BankAccounts {
	// A single instance for bank accounts
	BANK;
	
	/**
	 * The list of accounts.
	 */
	private List<Account> accounts;
	
	/**
	 * Creates the bank accounts object.
	 */
	private BankAccounts() {
		accounts = new ArrayList<Account>();
	}
	
	/**
	 * Adds an account.
	 * @param acct the account
	 */
	public void addAccount(Account acct) {
		accounts.add(acct);
	}
	
	/**
	 * Gets account by holder name.
	 * @param name the holder's name
	 * @return the account; null if it does not exist
	 */
	public Account getAccountByName(String name) {
		for (Account a : accounts) {
			if (a.getName().equals(name))
				return a;
		}
		return null;
	}
	
	/**
	 * Gets the account by account number.
	 * @param num the account number
	 * @return the account; null if it does not exist
	 */
	public Account getAccountByNum(String num) {
		for (Account a : accounts) {
			if (a.getNum().equals(num))
				return a;
		}
		return null;
	}
	
	/**
	 * Deletes account by name.
	 * @param name the holder's name
	 */
	public void deleteAccountByName(String name) {
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getName().equals(name))
				accounts.remove(i);
		}
	}
	
	/**
	 * Returns a list of the accounts.
	 * @return accounts list
	 */
	public List<Account> getAccounts() {
		return accounts;
	}
}
