/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import modelo.IEntidad;

/**
 *
 * @author Elio
 */
public interface IDAO {
    public int Insertar (IEntidad objeto) throws Exception;
    public int Eliminar (String condicion) throws Exception;
    public int Modificar (IEntidad objeto, String condicion) throws Exception;
    public IEntidad BuscarPorAccionista(String codigo) throws Exception;
    public ArrayList <IEntidad> listar(String condicion) throws Exception;
    public ResultSet ConsultarTotalParticipaciones() throws Exception;
    public ResultSet ConsultarInteresesBancariosPorMesYAnio(String mes, String anio) throws Exception;
    public ResultSet ConsultarInteresesPagadosPorMesYAnio(String mes, String anio) throws Exception;
    public ResultSet ConsultarGananciaPorVentaDivisasPorMesYAnio(String mes, String anio) throws Exception;
}
