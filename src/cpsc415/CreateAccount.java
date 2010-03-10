package cpsc415;

import static cpsc415.BankAccounts.BANK;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateAccount extends HttpServlet {

	public CreateAccount() {
		// No initialization required here.
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// Retrieve account name from client form: exp03/exp03.html/create
		String  name = req.getParameter("AcctName");
		Account acct = new Account(name);
		
		// Add account to BankAccounts object
		BANK.addAccount(acct);
		
		// Build response
		StringBuilder b = new StringBuilder();
		b.append("<html>")
		 .append("<head><title>Account Created</title></head>")
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
