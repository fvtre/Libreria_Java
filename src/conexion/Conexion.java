/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    String url = "jdbc:oracle:thin:@//localhost:1521/XEPDB1";
    String user = "BIBLIOTECA";
    String password = "biblioteca23";
    
    private Connection conexion = null;
    
    public Conexion(){
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());    //SQLite
            //conexion = (Connection) DriverManager.getConnection(url, user, password);
            conexion = (Connection) DriverManager.getConnection("jdbc:sqlite:BIBLIOTECA.db");////SQLite
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Cerrar() throws SQLException{
        conexion.close();
    }
    
    public Connection getConexion(){
        return conexion;
    }

    public void consultarUsuario(String text, String text0) {
        
    }

    public Connection conectar() {
        try {
            //DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());    //SQLite
            //conexion = (Connection) DriverManager.getConnection(url, user, password);
            // Cambia la URL, usuario y contraseña para adaptarlos a tu base de datos
            // Si estás usando SQLite, la conexión sería diferente
            conexion = (Connection) DriverManager.getConnection("jdbc:sqlite:BIBLIOTECA.db");//SQLite
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }
    
}
