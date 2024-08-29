/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Usuario
 */
public class Cuenta {
    /*La clase tiene dos atributos privados, usuario y contrasena*/       
    private String usuario;
    private String contrasena;

    /*La clase tiene dos constructores*/
    
    /*Toma dos parámetros (usuario y contrasena) y se utiliza para 
    crear una instancia de la clase con valores específicos para el nombre de usuario y la contraseña*/
    public Cuenta(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    
    /*Constructor vacío que no toma parámetros y no realiza ninguna acción adicional. 
    Puede ser utilizado para crear una instancia de la clase sin proporcionar valores iniciales*/
    public Cuenta() {
  
    }
    /*Los métodos get permiten obtener el valor actual de los atributos*/
    /*Los métodos set permiten establecer nuevos valores para los atributos*/
    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
