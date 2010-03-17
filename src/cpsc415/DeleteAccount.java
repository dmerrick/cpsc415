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

		// retrieve account name from client form
		String  name = req.getParameter("AcctName");
		
		// Get the account
		Account acct = BANK.getAccountByName(name);
		
    if( acct != null) {

    // this isnt really important cause we're deleting it anyway
    //Transaction t = new Transaction(acct.getClient(), "DELETE:"+acct.getNum());
    //String log = acct.addTransaction(t);

		// delete the account
		BANK.deleteAccountByName(name);
		
		// build response
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

    return;

    } else { // account doesnt exist

		  // build response
		  StringBuilder b = new StringBuilder();

      b.append("<html>")
		   .append("<head><title>Account does not exist!</title></head>")
		   .append("<body>")
		   .append("<h1>Account does not exist</h1>")
		   .append("<p>")
		   .append("The account with name \'")
		   .append(name)
		   .append("\' does not exist.")
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
	
}
