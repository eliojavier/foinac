/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import datos.DAOTransaccion;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Transaccion;

/**
 *
 * @author Elio
 */
public class ComprarAccion extends HttpServlet {

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
        
        String accionista = request.getParameter("accionista");
        String tipoOperacion = "Compra accion";
        String monto = request.getParameter("monto");
        String numAcciones = request.getParameter("numacciones");
        String fecha = request.getParameter("fecha");
        
        Double valorAccion = Double.parseDouble(monto)/Integer.parseInt(numAcciones);
        
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        
        Date f = null;
        
        try {
            f = df.parse(fecha);           
        } catch (ParseException ex) {
            Logger.getLogger(InsertarTransaccion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (int i = 0; i < Integer.parseInt(numAcciones); i++)
        {
            Transaccion transaccion = new Transaccion(accionista, tipoOperacion, valorAccion, f);
            try {
                DAOTransaccion daoT = new DAOTransaccion();
                daoT.Insertar(transaccion);
            } 
            catch (Exception ex) {
                Logger.getLogger(InsertarTransaccion.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex);
            }
        }
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
