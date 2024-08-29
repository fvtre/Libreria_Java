/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import conexion.Conexion;
import dao.DaoLibro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Libro;
import view.*;

/**
 *
 * @author ismae
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*AgregarLibro agregarLibro = new AgregarLibro();
        agregarLibro.setVisible(true);
        
        ListarLibro listarLibro = new ListarLibro();
        listarLibro.setVisible(true);
        
        EditarLibro editaLibro = new EditarLibro();
        editaLibro.setVisible(true);
        
        EditarLibroForm editarLibroForm = new EditarLibroForm();
        editarLibroForm.setVisible(true);
        
        Eliminar eliminarLibro = new Eliminar();
        eliminarLibro.setVisible(true);
        
        FormRegistro form = new FormRegistro();
        form.setVisible(true);
        
        FormLogin formLogin = new FormLogin();
        formLogin.setVisible(true);*/
        
        ListarLibro listarLibro = new ListarLibro();
        listarLibro.setVisible(true);
        
    }
    
}
