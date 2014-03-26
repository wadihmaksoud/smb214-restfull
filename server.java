import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Wadih
 */
@WebServlet(urlPatterns = {"/server"})
public class server extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    // Creation des paramétres essentielles du calcul une variable action pour préciser l'action du calcul. 
    // La fonction processRequest contient deux parametres de type httpServletRequest une requette et une reponse
    // 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String action = request.getParameter("action");
        String parametre1 = request.getParameter("param1");
        String parametre2 = request.getParameter("param2");
        try (PrintWriter out = response.getWriter()) {
//            out.println("herer"+action+"-"+parametre1+"-"+parametre2);
        if(action == null || parametre1.equals("") || parametre2.equals("") || !IsInteger(parametre1) || !IsInteger(parametre2) ){
            out.println("Les paramètres ne sont pas bien défini!!");
            response.setStatus(400);
        }
        int param1= Integer.parseInt(parametre1);
        int param2= Integer.parseInt(parametre2);
        
        switch (action){
            case "addition":
                out.println(param1+param2);
                break;
            case "soustraction":
                out.println(param1-param2);
                break;
            case "multiplication":
                out.println(param1*param2);
                break;
            case "division":
                out.println(param1/param2);
                break;
            default: response.setStatus(405);
                out.println("La méthode n'existe pas.");
                break;
                
        }
        }
    }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
    
    public static boolean IsInteger(String param) {
        try {
            Integer.parseInt(param);

        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

}
