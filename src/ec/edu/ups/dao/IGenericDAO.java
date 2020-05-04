/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

/**
 *
 * @author Dr. Gabriel A. León Paredes
 */
public interface IGenericDAO {
    
    //Métodos CRUD
    public void create(Object obj);
    public Object read(Object obj);
    public void update(Object obj);
    public void delete(Object obj);
}
