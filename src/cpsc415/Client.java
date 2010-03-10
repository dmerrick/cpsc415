package cpsc415;

/**
 * Represents a client.
 */
public class Client {

	/**
	 * Represents the next account number.
	 */
	private static int clientNum = 0;
	
	/**
	 * Client holders name.
	 */
	private String name;
	
	/**
	 * The client id number.
	 */
	private String num;
	
	/**
	 * The address of the client.
	 */
	private String address;
	
	/**
	 * The telephone number of the client.
	 */
	private String telephone;
	
	/**
	 * The email address of the client.
	 */
	private String email;
	
	/**
	 * Creates a new client.
	 * 
	 * @param name client's name
	 */
	public Account(String name) {
		this.name   = name;
		this.num    = "ID" + clientNum++;
	}

	public String getName() {
    return name;
  }

	public String getNum() {
    return num;
  }

	public String toString() {
		return "Client #: " + num + "; Name: " + name + "; Address: " + address +
      "; Email: " + email + "; Telephone #: " + telephone;
	}
	
}
