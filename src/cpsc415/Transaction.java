package cpsc415;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Represents a transaction.
 */
public class Transaction {

	/**
	 * Client object.
	 */
	private Client client;
	
	/**
	 * A description of the transaction.
	 */
	private String description;
	
	/**
	 * The date of the transaction.
	 */
	private Date date;
	
	/**
	 * Creates a new transaction.
	 * 
	 * @param client the client
   * @param desc the string description of the transaction
	 */
	public Transaction(Client client, String desc) {
		this.client = client;
		this.description = desc;
    this.date = new Date();
	}

	/**
	 * Creates a new transaction with a specified date.
	 * 
	 * @param client the client
   * @param desc the string description of the transaction
   * @param date the date of the transaction
	 */
	public Transaction(Client client, String desc, Date date) {
		this.client = client;
		this.description = desc;
    this.date = date;
	}

	public Client getClient() {
    return client;
  }

	public String getDescription() {
    return description;
  }

	public String getDateString() {
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    return dateFormat.format(this.date);
  }

	public String toString() {
    StringBuilder ret = new StringBuilder();

    ret.append(client.getName())
       .append(" -> ")
       .append(description)
       .append(" - ")
       .append(this.getDateString());

		return ret.toString();
	}
	
}
