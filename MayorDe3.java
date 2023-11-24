

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MayorDe3
 */
public class MayorDe3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MayorDe3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		String num3 = request.getParameter("num3");
		
		Integer num1_int = Integer.parseInt(num1);
		Integer num2_int = Integer.parseInt(num2);
		Integer num3_int = Integer.parseInt(num3);
		
		PrintWriter out = response.getWriter();
		
		if(num1_int>num2_int && num1_int>num3_int) {
			out.println("El mayor es "+num1_int); // número 1
		} else if (num2_int>num1_int && num2_int>num3_int) {
			out.println("El mayor es "+num2_int); // número 2
		} else if(num3_int>num2_int && num3_int>num1_int) {
			out.println("El mayor es "+num3_int); // número 3
		} else if(num1_int==num3_int && num1_int> num2_int) {
			out.println("El mayor es "+num1_int); // números 1 y 3 iguales
		} else if(num1_int==num2_int && num1_int> num3_int) {
			out.println("El mayor es "+num1_int);// números 1 y 2 iguales
		} else if(num3_int==num2_int && num3_int> num1_int) {
			out.println("El mayor es "+num3_int); // números 2 y 3 iguales
		} else {
			out.println("Todos los numeros son iguales.");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
