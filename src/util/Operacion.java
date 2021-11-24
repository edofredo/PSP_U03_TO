/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Cristian
 */
public class Operacion implements Serializable{
    
    private String operacion;
    private int cantidad;
    private Date fecha;

    public Operacion(String op, int cant){
        operacion = op;
        cantidad = cantidad;
        fecha = new Date();
    }     
    
    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
          
    
    
}
