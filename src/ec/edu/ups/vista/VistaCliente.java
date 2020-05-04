/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Cliente;
import java.util.Scanner;

/**
 *
 * @author Dr. Gabriel A. León Paredes
 */
public class VistaCliente {
    
    public  void imprimirDatosCliente(int id, String nombre, String apellido){
        System.out.println("Datos del Cliente");
        System.out.println("ID: " + id);
        System.out.println("Nombre: "+ nombre);
        System.out.println("Apellido: " + apellido);
    }
}
