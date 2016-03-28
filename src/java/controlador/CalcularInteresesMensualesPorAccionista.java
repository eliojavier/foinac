/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import datos.DAOTransaccion;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Elio
 */
public class CalcularInteresesMensualesPorAccionista extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
                                  throws ServletException, IOException {
            
        int totalParticipaciones = -1;
        double totalInteresesPagados = 0;
        double totalInteresesBancarios = 0;
        double totalGananciaPorVentasDivisa = 0;
        
        ResultSet rs;
        
        String mes = request.getParameter("mes");
        String anio = request.getParameter("anio");
                          
        try{
            DAOTransaccion t = new DAOTransaccion();
            
            rs = t.ConsultarTotalParticipaciones();            
            while(rs.next()){
                if(rs.getString("TOTALACCIONES")!=null)
                    totalParticipaciones = Integer.parseInt(rs.getString("TOTALACCIONES"));
            }
            
            rs = t.ConsultarInteresesPagadosPorMesYAnio(mes, anio);                      
            while(rs.next()){
                if(rs.getString("TOTALINTERESESPAGADOS")!=null)
                    totalInteresesPagados = Double.parseDouble(rs.getString("TOTALINTERESESPAGADOS"));
            }
            
            rs = t.ConsultarInteresesBancariosPorMesYAnio(mes, anio);
            while(rs.next()){
                if(rs.getString("TOTALINTERESBANCARIOS")!=null)
                    totalInteresesBancarios = Double.parseDouble(rs.getString("TOTALINTERESBANCARIOS"));
            }
            
            rs = t.ConsultarGananciaPorVentaDivisasPorMesYAnio(mes, anio);
            while(rs.next()){
                if(rs.getString("TOTALGANANCIAVENTADIVISAS")!=null)
                    totalGananciaPorVentasDivisa = Double.parseDouble(rs.getString("TOTALGANANCIAVENTADIVISAS"));
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(CalcularInteresesMensualesPorAccionista.class.getName()).log(Level.SEVERE, null, ex);
        }       
         catch (Exception ex) {
            Logger.getLogger(CalcularInteresesMensualesPorAccionista.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        totalParticipaciones = 10;
        System.out.println("totalParticipaciones= " + totalParticipaciones);
        System.out.println("totalInteresesPagados= " + totalInteresesPagados);  
        System.out.println("totalInteresesBancarios= " + totalInteresesBancarios);
        System.out.println("totalGananciaPorVentasDivisa= " + totalGananciaPorVentasDivisa);
        System.out.println("Interes por accion= " + 
                          (totalInteresesPagados+totalInteresesBancarios+totalGananciaPorVentasDivisa)
                            /totalParticipaciones);
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

}
