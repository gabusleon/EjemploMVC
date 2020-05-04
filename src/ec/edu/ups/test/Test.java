/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.vista.VistaCliente;

/**
 *
 * @author Dr. Gabriel A. León Paredes
 */
public class Test {

    public static void main(String[] args) {
        // modelo creado con el método estático 
        Cliente cliente = ingresarDatosCliente();
        VistaCliente vista = new VistaCliente();

        //se crea un objeto controlador y se le pasa el modelo y la vista
        ControladorCliente controlador = new ControladorCliente(cliente, vista);

        // se muestra los datos del cliente
        controlador.actualizarVista();

        // se actualiza un cliente y se muestra de nuevo los datos
        controlador.setNombre("Juanito");
        controlador.actualizarVista();
    }

    //método estático que retorna el cliente con sus datos
    private static Cliente ingresarDatosCliente() {        
        Cliente cliente = new Cliente();
        cliente.setId(1);
        cliente.setNombre("Pepito");
        cliente.setApellido("Perez");
        return cliente;
    }
}
