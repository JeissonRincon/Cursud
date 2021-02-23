/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package likeCusos.datos;

/**
 *
 * @author CARLOS SANTIAGO ROJAS MORENO
 */

import likeCusos.negocio.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import likeCusos.util.ServiceLocator;
import java.util.ArrayList;


public class CursosLikeDAO {
    
     public CursosLikeDAO(){
       
    }
    
    public ArrayList<Curso> buscarCursoLike(String nombre){
        ArrayList<Curso> cursos = new ArrayList<>();
        
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT n_nomcurso,N_DESCRIPCION ,N_DIRIMAGEN ,N_PRECIO  FROM  curso WHERE n_nomcurso like '"+nombre+"%'");       
        ServiceLocator myConn = ServiceLocator.getInstance();
       try {
        Connection conn = myConn.tomarConexion();
        PreparedStatement ps = conn.prepareStatement(sql.toString());
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Curso curso = new Curso();
            curso.setNombre(rs.getString(1));
            curso.setDescripcion(rs.getString(2));
            curso.setDirImagen(rs.getString(3));
            curso.setPrecio(rs.getInt(4));
            cursos.add(curso);
        }
        
         
      }
      catch(SQLException ex){
          System.out.println("No se puede ver el usuario "+ex.getMessage());
         ex.printStackTrace();
         return cursos = null;
      }
        myConn.liberarConexion();
        
        
        return cursos;
        
    }
    
    
     
}
