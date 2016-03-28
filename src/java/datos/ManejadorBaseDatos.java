/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Elio
 */
public class ManejadorBaseDatos {
    protected String driver = "org.apache.derby.jdbc.ClientDriver";
    protected String url = "jdbc:derby://"; // jdbc:derby://localhost:1527/foinacbd";
    protected String IPServidorBD = "localhost";   
    protected int puertoServidorBD = 1527;
    protected String nombreBD = "foinacbd";
    protected String usuarioBD = "foinac";
    protected String contrasenaBD = "foinac";      
    private Connection conexion;
    private PreparedStatement sentencia;
    private ResultSet filasConsulta;
    
    public ManejadorBaseDatos() throws Exception
    {
        url = url + IPServidorBD + ":" + puertoServidorBD + "/" + nombreBD;
        this.Conectar();
    }
    
    public ManejadorBaseDatos (String driver, String IPServidorBD, String url,
                               String nombreBD, String usuarioBD, 
                               String contrasenaBD) throws Exception
    {
        this.driver = driver;
        this.IPServidorBD = IPServidorBD;
        this.url = url;
        this.nombreBD = nombreBD;
        this.usuarioBD = usuarioBD;
        this.contrasenaBD = contrasenaBD;
        this.Conectar();
    }
    
    public final void Conectar () throws Exception
    {
        try{
            Class.forName(driver);           
        }
        catch(ClassNotFoundException ex){
            throw new Exception("Error de conexion: " + ex.getMessage());
        }
        
        try{
            conexion = DriverManager.getConnection(url, usuarioBD, contrasenaBD);
        }
        catch(SQLException ex){
            throw new Exception ("Error de conexion: " + ex.getMessage());
        }
                
        
    }
    
    public int Actualizar(PreparedStatement sentencia) throws Exception{
        try{
            int res = sentencia.executeUpdate();
            return res;
        }
        catch(SQLException ex){
            throw new Exception ("Error al ejecutar la sentencia: " + ex.getMessage());
        }
    }
    
    public ResultSet Consultar(PreparedStatement sentencia) throws Exception{
        try{
            ResultSet filasBD = sentencia.executeQuery(); 
            return filasBD;
        }
        catch(SQLException ex){
            throw new Exception("Error al ejecutar la sentencia: " + ex.getMessage());
        }       
    }
    
    public void Desconectar() throws Exception{
        try{
            conexion.close();
        }
        catch(SQLException ex){           
            conexion = null;
        }
    }
    
    public PreparedStatement crearSentencia(String sql) throws Exception{
        try{  
            PreparedStatement s = conexion.prepareStatement(sql);
            return s;
        }
        catch(SQLException ex){
            throw new Exception("Error al ejecutar la sentencia: " + ex.getMessage() +ex.getSQLState());
        }
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIPServidorBD() {
        return IPServidorBD;
    }

    public void setIPServidorBD(String IPServidorBD) {
        this.IPServidorBD = IPServidorBD;
    }

    public int getPuertoServidorBD() {
        return puertoServidorBD;
    }

    public void setPuertoServidorBD(int puertoServidorBD) {
        this.puertoServidorBD = puertoServidorBD;
    }

    public String getNombreBD() {
        return nombreBD;
    }

    public void setNombreBD(String nombreBD) {
        this.nombreBD = nombreBD;
    }

    public String getUsuarioBD() {
        return usuarioBD;
    }

    public void setUsuarioBD(String usuarioBD) {
        this.usuarioBD = usuarioBD;
    }

    public String getContrasenaBD() {
        return contrasenaBD;
    }

    public void setContrasenaBD(String contrasenaBD) {
        this.contrasenaBD = contrasenaBD;
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public PreparedStatement getSentencia() {
        return sentencia;
    }

    public void setSentencia(PreparedStatement sentencia) {
        this.sentencia = sentencia;
    }

    public ResultSet getFilasConsulta() {
        return filasConsulta;
    }

    public void setFilasConsulta(ResultSet filasConsulta) {
        this.filasConsulta = filasConsulta;
    }
    
    
}

