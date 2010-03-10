package cpsc415;

import static cpsc415.BankAccounts.BANK;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Deposit extends HttpServlet {

	public Deposit() {
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		String name   = req.getParameter("AcctName");
		String amount = req.getParameter("Amount");
		// Make deposit
		Account acct = BANK.getAccountByName(name);
		acct.deposit(amount);

		StringBuilder b = new StringBuilder();
		b.append("<html>")
		 .append("<head><title>Deposit</title></head>")
		 .append("<body>")
		 .append("<h3>Deposit of ")
		 .append(acct.getAmount())
		 .append(" into account #")
		 .append(acct.getNum())
		 .append(" was successful</h3>")
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
