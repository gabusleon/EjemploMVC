/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.vista.VistaCliente;

/**
 *
 * @author Dr. Gabriel A. León Paredes
 */
public class ControladorCliente {

    //objetos vista y modelo
    private VistaCliente vistaCliente;
    private Cliente cliente;

    // constructor
    public ControladorCliente(Cliente cliente, VistaCliente vistaCliente) {
        this.cliente = cliente;
        this.vistaCliente = vistaCliente;
    }

    //getters y setters para el modelo
    public int getId() {
        return cliente.getId();
    }

    public void setId(int id) {
        this.cliente.setId(id);
    }

    public String getNombre() {
        return cliente.getNombre();
    }

    public void setNombre(String nombre) {
        this.cliente.setNombre(nombre);
    }

    public String getApellido() {
        return cliente.getApellido();
    }

    public void setApellido(String apellido) {
        this.cliente.setApellido(apellido);
    }

    //pasa el modelo a la vista para presentar los datos
    public void actualizarVista() {
        this.vistaCliente.imprimirDatosCliente(cliente.getId(), cliente.getNombre(), cliente.getApellido());
    }
}
