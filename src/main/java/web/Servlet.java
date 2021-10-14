package web;

import java.io.IOException;
import java.io.PrintWriter;
import javafx.print.Printer;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")

public class Servlet extends HttpServlet {

    @Override

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        String lenguaje []= request.getParameterValues("lenguajes");
        String genero = request.getParameter("genero");
        String ocupacion = request.getParameter("ocupacion");
        String musica [] = request.getParameterValues("musica");
        String comentarios = request.getParameter("comentarios");
        
        
        
        //falta for para verificar los selects
        out.print("<html> <body>"
                + ""
                + ""
                + "<table><tr><td>Usuario</td><td>"+usuario+"</td>  </tr><tr><td>Contraseña</td><td>"+password+"</td>  </tr>"
                        + ""
                        + "<tr><td>Lenguaje</td><td>"+lenguaje+"</td>  </tr>"
                                + ""
                                + "<tr><td>Genero</td><td>"+genero+"</td>  </tr>"
                                        + ""
                                        + "<tr><td>Ocupacion </td><td>"+ocupacion+"</td>  </tr>"
                                                + "<tr><td>Musica</td><td>"+musica+"</td>  </tr>"
                                                        + "<tr><td>Comentarios</td><td>"+comentarios+"</td>  </tr></table></body></html>");
        
        

    }

}
