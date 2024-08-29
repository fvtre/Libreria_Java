/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;

/**
 *
 * @author ismae
 * @param <T>
 */
public interface IDao<T> {
    int agregar(T o); 
    int editar(T o);
    int eliminar(T o);     
    
    List<T> seleccionar();
    T seleccionarUno(int id);
}
