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

	public String getName() {
    return name;
  }

	public String getNum() {
    return num;
  }

  public void setAddress(String address) {
    this.address = address;
  }
	
  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }
	
  public void setEmail(String email) {
    this.email = email;
  }
	

	public String toString() {
    StringBuilder ret = new StringBuilder();

    ret.append(name);

    // FIXME: these aren't working ATM
    if(address != null)
      ret.append("<br>Address: " + address);
    if(telephone != null)
      ret.append("<br>Telephone Number: " + telephone);
    if(email != null)
      ret.append("<br>Email: " + email);

		return ret.toString();
	}
	
}
