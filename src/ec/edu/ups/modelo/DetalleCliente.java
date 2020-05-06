/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author Dr. Gabriel A. León Paredes
 */
public class DetalleCliente {

    private int id;
    private String detalle;

    public DetalleCliente() {
    }

    public DetalleCliente(int id, String detalle) {
        this.id = id;
        this.detalle = detalle;
    }

    public String getDetalle() {
        return detalle;
    }

    public int getId() {
        return id;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DetalleCliente{" + "id=" + id + ", detalle=" + detalle + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DetalleCliente other = (DetalleCliente) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    
}
