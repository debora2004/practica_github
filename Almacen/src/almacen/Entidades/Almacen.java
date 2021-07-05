/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen.Entidades;

/**
 *
 * @author Marcos
 */
public class Almacen {
    
    private String nombreEmpresa;
    private String direccion;

    public Almacen() {
    }

    public Almacen(String nombreEmpresa, String direccion) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Almacen{" + "nombreEmpresa=" + nombreEmpresa + ", direccion=" + direccion + '}';
    }
    
    
    
}
