package controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import datos.DAOTransaccion;
import java.io.IOException;
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
public class InsertarTransaccion extends HttpServlet {

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
            throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");             
        
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
        String tipoOperacion = request.getParameter("tipoOperacion");
        String monto = request.getParameter("monto");
        String fecha = request.getParameter("fecha");
        System.out.println(fecha);
        
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        
        Date f = null;
        
        try {
            f = df.parse(fecha);           
        } catch (ParseException ex) {
            Logger.getLogger(InsertarTransaccion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Transaccion transaccion = new Transaccion(accionista, tipoOperacion, Double.parseDouble(monto), f);
        try {
            DAOTransaccion daoT = new DAOTransaccion();
            daoT.Insertar(transaccion);
        } catch (Exception ex) {
            Logger.getLogger(InsertarTransaccion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
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
