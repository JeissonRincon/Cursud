/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mostrarCursos.datos;

/**
 *
 * @author CARLOS SANTIAGO ROJAS MORENO
 */

import mostrarCursos.negocio.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import mostrarCursos.util.ServiceLocator;
import java.util.ArrayList;


public class CursosOfertaDAO {
    
     public CursosOfertaDAO(){
       
    }
    
    public ArrayList<Curso> buscarCursos(){
        ArrayList<Curso> cursos = new ArrayList<>();
        
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT  n_nomcurso,N_DESCRIPCION ,N_DIRIMAGEN ,N_PRECIO FROM curso");       
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
