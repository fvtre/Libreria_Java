/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Cuenta;

/**
 *
 * @author Usuario
 */
public class User implements ICuenta<Cuenta>{
    final String REGISTRAR = "INSERT INTO CUENTA (usuario, contrasena)"
            + "VALUES (?, ?)";
    
    final String ACCEDER = "SELECT * FROM CUENTA WHERE usuario = ? and contrasena = ?";
   
    
    @Override
    public int registrar(Cuenta o) {
        try{
            
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConexion();
            
            PreparedStatement st = connection.prepareStatement(REGISTRAR);  
            
            st.setString(1, o.getUsuario());  
            st.setString(2, o.getContrasena());  
            
            return st.executeUpdate();            
                        
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }


    @Override
    public Cuenta acceder(String usuario, String contrasena) {
        Cuenta cuenta = null;
        

        try{

            Conexion conexion = new Conexion();
            Connection connection = conexion.getConexion();
            PreparedStatement st = connection.prepareStatement(ACCEDER);
            st.setString(1, usuario);
            st.setString(2, contrasena);

            
            ResultSet rs = st.executeQuery();       
            
            if(rs.next()){
                cuenta = new Cuenta();
                cuenta.setUsuario(rs.getString("usuario"));
                cuenta.setContrasena(rs.getString("contrasena"));
                
                /*rs.close();
                st.close();
                connection.close();*/
                
            }
        } catch(SQLException ex){
           ex.printStackTrace();
        }
        return cuenta;
    }
    
}

