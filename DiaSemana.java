

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class DiaSemana
 */
public class DiaSemana extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DiaSemana() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String dia;
		String num = request.getParameter("num");
		Integer numero = Integer.parseInt(num);
		
		PrintWriter out = response.getWriter();
		 switch (numero) {
         case 1:
             dia = "Lunes";
             break;
         case 2:
             dia = "Martes";
             break;
         case 3:
             dia = "Miercoles";
             break;
         case 4:
             dia = "Jueves";
             break;
         case 5:
             dia = "Viernes";
             break;
         case 6:
             dia = "Sabado";
             break;
         case 7:
             dia = "Domingo";
             break;
         default:
             dia = "Numero fuera de rango";
     }
     
     out.println("El día de la semana correspondiente al numero " + numero + " es: " + dia);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
