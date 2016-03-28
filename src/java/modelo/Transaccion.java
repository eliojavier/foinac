/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Elio
 */
public class Transaccion{
    public String accionista;
    public String tipoTransaccion;
    public double monto;
    public Date fecha;

    public Transaccion(){
    }

    public Transaccion(String accionista, String tipoTransaccion, double monto, Date fecha) {
        this.accionista = accionista;
        this.tipoTransaccion = tipoTransaccion;
        this.monto = monto;
        this.fecha = fecha;
    }

    public String getAccionista() {
        return accionista;
    }

    public void setAccionista(String accionista) {
        this.accionista = accionista;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }  
}
