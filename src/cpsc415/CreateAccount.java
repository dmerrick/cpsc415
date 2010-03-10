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

		// retrieve account name from client form
		String name = req.getParameter("AcctName");

    // check to see if account with that name already exists
    if (BANK.getAccountByName(name) != null) {

		  // build response
		  StringBuilder b = new StringBuilder();

		  b.append("<html>")
		   .append("<head><title>Account already exists!</title></head>")
		   .append("<body>")
		   .append("<h1>Account already exists</h1>")
		   .append("<p>")
		   .append("The account with name \'")
		   .append(name)
		   .append("\' already exists.")
		   .append("</p>")
		   .append("<p>")
		   .append(Experiment.linkToHome("Return to Accounts"))
		   .append("</p>")
		   .append("</body>")
		   .append("</html>");

		  resp.getOutputStream().println(b.toString());

      return;
    }

    // create a new account with that name
		Account acct = new Account(name);
		
		// add account to BANK object
		BANK.addAccount(acct);
		
		// build response
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

    return;
	}

}
