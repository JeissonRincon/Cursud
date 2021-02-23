/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login.datos;

/**
 *
 * @author CARLOS SANTIAGO ROJAS MORENO
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Login.util.ServiceLocator;


public class UsuarioDAO {
    
     public UsuarioDAO(){
       
    }
    
    public boolean buscarUsuario(String usuario, String password){
        boolean conecto = false;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT n_usuario,n_contrasena FROM usuario WHERE n_usuario = '"+usuario+"' and n_contrasena = '"+password+"'");       
        ServiceLocator myConn = ServiceLocator.getInstance();
       try {
        Connection conn = myConn.tomarConexion();
        PreparedStatement ps = conn.prepareStatement(sql.toString());
        ResultSet rs = ps.executeQuery();
        rs.next();
        String usu = rs.getString(1);

        conecto = true;
                
        
         
      }
      catch(SQLException ex){
          System.out.println("No se puede ver el usuario "+ex.getMessage());
         ex.printStackTrace();
         conecto = false;
      }
        myConn.liberarConexion();
        
        
        return conecto;
        
    }
    
    
     
}
