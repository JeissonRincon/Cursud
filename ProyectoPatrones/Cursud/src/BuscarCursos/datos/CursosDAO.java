/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuscarCursos.datos;

/**
 *
 * @author CARLOS SANTIAGO ROJAS MORENO
 */

import BuscarCursos.negocio.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import BuscarCursos.util.ServiceLocator;
import java.util.ArrayList;


public class CursosDAO {
    
     public CursosDAO(){
       
    }
    
    public ArrayList<Curso> buscarUsuario(String usuario){
        ArrayList<Curso> cursos = new ArrayList<>();
        
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT c.n_nomcurso,c.N_DESCRIPCION ,c.N_DIRIMAGEN ,c.N_PRECIO  FROM usuario_curso uc, curso c,usuario u WHERE uc.n_usuario ='"+usuario+"' and uc.k_codcurso = c.k_codcurso and uc.n_usuario = u.n_usuario");       
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
