package cpsc415.exp03;

import static cpsc415.exp03.BankAccounts.BANK;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteAccount extends HttpServlet {
	
	public DeleteAccount() {
		// No initialization required
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// Retrieve account name from client form: exp03/exp03.html/delete
		String  name = req.getParameter("AcctName");
		
		// Get the account
		Account acct = BANK.getAccountByName(name);
		
		// Delete the account
		BANK.deleteAccountByName(name);
		
		// Build response
		StringBuilder b = new StringBuilder();
		b.append("<html>")
		 .append("<head><title>Account Deleted</title></head>")
		 .append("<body>")
		 .append("<p>")
		 .append(acct)
		 .append("</p>")
		 .append("<p>")
		 .append("<a href=\"/exp03/exp03.html\">Return to Accounts</a>")
		 .append("</p>")
		 .append("</body>")
		 .append("</html>");
		resp.getOutputStream().println(b.toString());
	}
	
}
