package cpsc415;

import static cpsc415.BankAccounts.BANK;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Transfer extends HttpServlet {

	public Transfer() {
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		String from   = req.getParameter("AcctNameFrom");
		String to     = req.getParameter("AcctNameTo");
		String amount = req.getParameter("Amount");

		// Make Transfer
		Account fromAcct = BANK.getAccountByName(from);
		fromAcct.withdraw(amount);
		Account toAcct = BANK.getAccountByName(to);
		toAcct.deposit(amount);

		StringBuilder b = new StringBuilder();
		b.append("<html>")
		 .append("<head><title>Deposit</title></head>")
		 .append("<body>")
		 .append("<p>Transfer of ")
		 .append(amount)
		 .append(" from account holder ")
		 .append(fromAcct.getName())
		 .append(" to account holder ")
		 .append(toAcct.getName())
		 .append(" was successful</p>")
		 .append("<p>")
		 .append(Experiment.linkToHome("Return to Accounts"))
		 .append("</p>")
		 .append("</body>")
		 .append("</html>");
		resp.getOutputStream().println(b.toString());		
	}
}
