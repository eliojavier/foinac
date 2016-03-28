/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.IEntidad;
import modelo.Transaccion;

/**
 *
 * @author Elio
 */
public class DAOTransaccion extends ManejadorBaseDatos implements IDAO {

    public DAOTransaccion() throws Exception {
    }

    public DAOTransaccion(String driver, String IPServidorBD, String url, 
            String nombreBD, String usuarioBD, String contrasenaBD) 
            throws Exception 
    {
        super(driver, IPServidorBD, url, nombreBD, usuarioBD, contrasenaBD);
    }
    
    public int Insertar(Transaccion objeto) throws Exception {
        Transaccion transaccion = (Transaccion) objeto;
        
        //convertir la fecha de util.Date a sql.Date para insertarla en BD
        java.sql.Date fecha = new java.sql.Date
                                (transaccion.getFecha().getTime());
            
        Conectar();
        
        String sentenciaSQL = "INSERT INTO Transaccion VALUES (?,?,?,?)";
        PreparedStatement sentencia = crearSentencia(sentenciaSQL);
        sentencia.setString(1, transaccion.getAccionista());
        sentencia.setString(2, transaccion.getTipoTransaccion());
        sentencia.setDouble(3, transaccion.getMonto());
        sentencia.setDate(4, fecha);
        System.out.println(transaccion.getFecha());
        return (Actualizar(sentencia));
    }

    @Override
    public int Eliminar(String condicion) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Modificar(IEntidad objeto, String condicion) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IEntidad BuscarPorAccionista(String codigo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<IEntidad> listar(String condicion) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Insertar(IEntidad objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet ConsultarTotalParticipaciones() throws Exception {
        Conectar();
        
        String sentenciaSQL = "SELECT COUNT(T.OPERACION) AS TOTALACCIONES " + 
                              "FROM TRANSACCION T " +
                              "WHERE T.OPERACION LIKE 'Compra accion'";
        
        PreparedStatement sentencia = crearSentencia(sentenciaSQL);
        
        return (Consultar(sentencia));
    }

    @Override
    public ResultSet ConsultarInteresesBancariosPorMesYAnio(String mes, String anio) throws Exception {
        Conectar();
        
        String sentenciaSQL =   "SELECT SUM(T.MONTO) AS TOTALINTERESBANCARIOS " + 
                                "FROM TRANSACCION T " +
                                "WHERE YEAR(T.FECHA) = " + anio + 
                                " AND MONTH(T.FECHA)  = " + mes  + 
                                " AND T.OPERACION LIKE 'Intereses banco'";
        
        PreparedStatement sentencia = crearSentencia(sentenciaSQL);
        
        return (Consultar(sentencia));
    }

    @Override
    public ResultSet ConsultarInteresesPagadosPorMesYAnio(String mes, String anio) throws Exception {
        Conectar();
        
        String sentenciaSQL =   "SELECT SUM(T.MONTO) AS TOTALINTERESESPAGADOS " + 
                                "FROM TRANSACCION T " +
                                "WHERE YEAR(T.FECHA) = " + anio + 
                                " AND MONTH(T.FECHA)  = " + mes  + 
                                " AND T.OPERACION LIKE 'Pago de intereses'";
        
        PreparedStatement sentencia = crearSentencia(sentenciaSQL);
        
        return (Consultar(sentencia));
    }

    @Override
    public ResultSet ConsultarGananciaPorVentaDivisasPorMesYAnio(String mes, String anio) throws Exception {
        Conectar();
        
        String sentenciaSQL =   "SELECT SUM(T.MONTO) AS TOTALGANANCIAVENTADIVISAS " + 
                                "FROM TRANSACCION T " +
                                "WHERE YEAR(T.FECHA) = " + anio + 
                                " AND MONTH(T.FECHA)  = " + mes  + 
                                " AND T.OPERACION LIKE 'Ganancia venta divisas'";
        
        PreparedStatement sentencia = crearSentencia(sentenciaSQL);
        
        return (Consultar(sentencia));    }
    
}
