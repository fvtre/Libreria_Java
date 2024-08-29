/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Libro;


/**
 *
 * @author ismae
 */
public class DaoLibro implements IDao<Libro>{
    /*final String INSERTAR = "INSERT INTO LIBRO (id, titulo, isbn, paginas, precio, anio, genero, editorial)"
            + "VALUES (SEQ_ID_LIBRO.NEXTVAL, ?, ?, ?, ?, ?, ?, ?)";*/
    final String INSERTAR="INSERT INTO LIBRO (titulo, isbn, paginas, precio, anio, genero, editorial) "
		+ "VALUES (?, ?, ?, ?, ?, ?, ?)";
    
    final String EDITAR = "UPDATE LIBRO SET titulo = ?, isbn = ?, paginas = ?, precio = ?, anio = ?, genero = ?, editorial = ?"
            + "WHERE id = ?";
    
    final String ELIMINAR = "DELETE FROM LIBRO WHERE id = ?";
    
    final String SELECCIONAR = "SELECT * FROM LIBRO";
    
    final String SELECCIONARUNO = "SELECT * FROM LIBRO WHERE id = ?";

    
    @Override
    public int agregar(Libro o) {
        try{
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConexion();
            PreparedStatement st = connection.prepareStatement(INSERTAR);
            
            st.setString(1, o.getTitulo());
            st.setString(2, o.getIsbn());
            st.setShort(3, o.getPaginas());
            st.setInt(4, o.getPrecio());
            st.setShort(5, o.getAnio());
            st.setString(6, o.getGenero());
            st.setString(7, o.getEditorial());
            
            return st.executeUpdate();
            
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
      
    }

    @Override
    public int editar(Libro o) {        
        try{
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConexion();
            PreparedStatement st = connection.prepareStatement(EDITAR);
            
            st.setString(1, o.getTitulo());
            st.setString(2, o.getIsbn());
            st.setShort(3, o.getPaginas());
            st.setInt(4, o.getPrecio());
            st.setShort(5, o.getAnio());
            st.setString(6, o.getGenero());
            st.setString(7, o.getEditorial());
            
            st.setInt(8,o.getId());
            
            int filasEditadas = st.executeUpdate();
            if (filasEditadas > 0) {
                return 1; /*se edito al menos una fila*/
            }else{
                return 0; /*no se edito ninguna fila*/
            
            }
             
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
            
    }

    @Override
    public int eliminar(Libro o) {
        try{
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConexion();
            PreparedStatement st = connection.prepareStatement(ELIMINAR);
            
            st.setInt(1, o.getId());
            
            return st.executeUpdate();
            
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    @Override
    public List<Libro> seleccionar() {
        List<Libro> libros = new ArrayList<>();
        Libro libro;
        
        try{            
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConexion();
            PreparedStatement st = connection.prepareStatement(SELECCIONAR);
            
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                libro = new Libro();

                libro.setId(rs.getInt("id"));
                libro.setTitulo(rs.getString("titulo"));
                libro.setIsbn(rs.getString("isbn"));
                libro.setPaginas(rs.getShort("paginas"));
                libro.setPrecio(rs.getInt("precio"));
                libro.setAnio(rs.getShort("anio"));
                libro.setGenero(rs.getString("genero")); 
                libro.setEditorial(rs.getString("editorial"));
            
                libros.add(libro);
                
            }
        }catch(SQLException ex){
            ex.printStackTrace();

        }
        return libros;       
    }

    @Override
    public Libro seleccionarUno(int id) {
        Libro libro = new Libro();
        
        try{
            
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConexion();
            PreparedStatement st = connection.prepareStatement(SELECCIONARUNO);
            st.setInt(1,id);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                libro.setId(rs.getInt("id"));
                libro.setTitulo(rs.getString("titulo"));
                libro.setIsbn(rs.getString("isbn"));
                libro.setPaginas(rs.getShort("paginas"));
                libro.setPrecio(rs.getInt("precio"));
                libro.setAnio(rs.getShort("anio"));
                libro.setGenero(rs.getString("genero")); 
                libro.setEditorial(rs.getString("editorial"));
     
            }
        }catch(SQLException ex){
            ex.printStackTrace();
            
        }
        return libro;
    
    }
    
    
}


