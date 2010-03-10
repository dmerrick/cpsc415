package cpsc415;

import java.util.ArrayList;
import java.util.List;

/**
 * A collection of all clients.
 */
public enum ClientList {

	// a single instance for clients
	CLIENTS;
	
	/**
	 * The list of clients.
	 */
	private List<Client> clients;
	
	/**
	 * Creates the clients object.
	 */
	private ClientList() {
		clients = new ArrayList<Client>();
	}
	
	/**
	 * Adds a client.
	 * @param client the client
	 */
	public void addClient(Client client) {
		clients.add(client);
	}
	
	/**
	 * Gets client by name
	 * @param name the client's name
	 * @return the client; null if it does not exist
	 */
	public Client getClientByName(String name) {
		for (Client c : clients) {
			if (c.getName().equals(name))
				return c;
		}
		return null;
	}
	
	/**
	 * Gets the client by client id.
	 * @param num the client id
	 * @return the client; null if it does not exist
	 */
	public Client getClientByNum(String num) {
		for (Client c : clients) {
			if (c.getNum().equals(num))
				return c;
		}
		return null;
	}
	
	/**
	 * Deletes client by name.
	 * @param name the client's name
	 */
	public void deleteClientByName(String name) {
		for (int i = 0; i < clients.size(); i++) {
			if (clients.get(i).getName().equals(name))
				clients.remove(i);
		}
	}
	
	/**
	 * Returns a list of the clients.
	 * @return clients list
	 */
	public List<Client> getClients() {
		return clients;
	}
}
