/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;


/**
 *
 * @author Dr. Gabriel A. León Paredes
 */
public class VistaCliente {
    
    public  void imprimirDatosCliente(int id, String nombre, String apellido, String detalle){
        System.out.println("Datos del Cliente");
        System.out.println("ID: " + id);
        System.out.println("Nombre: "+ nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Detalle: " + detalle);
    }
}
