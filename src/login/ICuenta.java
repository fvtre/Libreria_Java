/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package login;

/**
 *
 * @author Usuario
 */
public interface ICuenta<T> {
    /*Este método toma un objeto de tipo T como parámetro y devuelve un entero.*/
    int registrar(T o);
    
    /*Este método toma dos cadenas de texto (usuario y contrasena) como parámetros y devuelve un objeto de tipo T.*/
    T acceder(String usuario, String contrasena);
}
