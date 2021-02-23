/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registrar.datos;

/**
 *
 * @author CARLOS SANTIAGO ROJAS MORENO
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Registrar.util.ServiceLocator;


public class UsuarioDAO {
    
     public UsuarioDAO(){
       
    }

  public boolean RegistrarUsuario(String nombre, String apellido, String usuario, String Contrasena){
        StringBuilder sql = new StringBuilder();
       sql.append("INSERT INTO USUARIO (n_usuario,n_nombreusu,n_apellidousu,n_contrasena,n_correo) VALUES(?,?,?,?,?)");
       
       ServiceLocator myConn = ServiceLocator.getInstance();

       try {
        Connection conexion = myConn.tomarConexion();
        PreparedStatement ps = conexion.prepareStatement(sql.toString());

                ps.setString(1,usuario); 
                ps.setString(2, nombre); 
                ps.setString(3, apellido);
                ps.setString(4, Contrasena);
                ps.setString(5, null);
                ps.executeUpdate();
                ps.close();
                myConn.commit();
            } catch (SQLException ex) {
                return false;
            }
            finally{
                myConn.liberarConexion();
            }
        return true;
    
    
    }
    
     
}
