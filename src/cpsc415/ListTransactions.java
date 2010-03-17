package cpsc415;

import static cpsc415.BankAccounts.BANK;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListTransactions extends HttpServlet {

	public ListTransactions() { }

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

    Account acct;

    String name = req.getParameter("AcctName");
		String number = req.getParameter("AcctNum");

    // choose the account by name or number
    if(name != null) {
		  acct = BANK.getAccountByName(name);
    } else {
      acct = BANK.getAccountByNum(number);
    }

		resp.setContentType("text/html");
		StringBuilder b = new StringBuilder();
		b.append("<html>")
		 .append("<head><title>Transactions</title></head>")
		 .append("<body>")
		 .append("<ul>");
		for (Transaction t : acct.getTransactions()) {
			b.append("<li>")
			 .append(t)
			 .append("</li>");
		}
		b.append("</ul>")
		 .append(Experiment.linkToHome("Return to Accounts"))
		 .append("</body>")
		 .append("</html>");
		resp.getOutputStream().println(b.toString());
	}

}
