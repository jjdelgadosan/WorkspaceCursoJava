package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculadora
 */
public class Calculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculadora() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("" 
				+ "<html>"
				+ "<body>"
				+ "<form name='calculator'>"
			    + "<h3>Calculadora</h3>"
				+ "<img src='f1Mercedes1.jpg'/>"
			    + "<p>Haz algun calculo para ver el resultado... Petardo</p>"
			    + "<input type='textfield' name='ans' value=''>"
			    + "<br>"
			    + "<input type='button' value='1' onClick='document.calculator.ans.value+='1''>"
			    + "<input type='button' value='2' onClick='document.calculator.ans.value+='2''>"
			    + "<input type='button' value='3' onClick='document.calculator.ans.value+='3''>"
			    + "<input type='button' value='+' onClick='document.calculator.ans.value+='+''>"
			    + "<br>"
			    + "<input type='button' value='4' onClick='document.calculator.ans.value+='4''>"
			    + "<input type='button' value='5' onClick='document.calculator.ans.value+='5''>"
			    + "<input type='button' value='6' onClick='document.calculator.ans.value+='6''>"
			    + "<input type='button' value=-'-' onClick='document.calculator.ans.value+='-''>"
				+ "<br>"
			    + "<input type='button' value='7' onClick='document.calculator.ans.value+='7''>"
			    + "<input type='button' value='8' onClick='document.calculator.ans.value+='8''>"
			    + "<input type='button' value='9' onClick='document.calculator.ans.value+='9''>"
			    + "<input type='button' value='*' onClick='document.calculator.ans.value+='*''>"
			    + "<br>"
			    + "<input type='button' value='0' onClick='document.calculator.ans.value+='0''>"
			    + "<input type='reset' value='c'>"
			    + "<input type='button' value='/' onClick='document.calculator.ans.value+='/''>"
			    + "<input type='button' value='=' onClick='document.calculator.ans.value=eval(document.calculator.ans.value)'>"
			    + "</form>)"
				+ "</body>"
				+ "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
