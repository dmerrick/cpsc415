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
	public Client(String name) {
		this.name   = name;
		this.num    = "ID" + clientNum++;
	}

	/**
	 * Returns the name of the client.
	 */
	public String getName() {
    return name;
  }

	/**
	 * Returns the number of the client.
	 */
	public String getNum() {
    return num;
  }

	/**
	 * Sets the address to a new value.
   *
   * @param address the address
	 */
  public void setAddress(String address) {
    this.address = address;
  }
	
	/**
	 * Sets the telephone number to a new value.
   *
   * @param telephone the number
	 */
  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }
	
	/**
	 * Sets the email address to a new value.
   *
   * @param email the address
	 */
  public void setEmail(String email) {
    this.email = email;
  }
	
  /**
   * Returns a String version of the client.
   */
	public String toString() {
    StringBuilder ret = new StringBuilder();

    ret.append(name);

    if(address != null)
      ret.append("<br>Address: " + address);
    if(telephone != null)
      ret.append("<br>Telephone Number: " + telephone);
    if(email != null)
      ret.append("<br>Email: " + email);

		return ret.toString();
	}
	
}
