package cpsc415;

import static cpsc415.BankAccounts.BANK;

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
		// Retrieve account name from client form
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
		 .append(Experiment.linkToHome("Return to Accounts"))
		 .append("</p>")
		 .append("</body>")
		 .append("</html>");
		resp.getOutputStream().println(b.toString());
	}
	
}
