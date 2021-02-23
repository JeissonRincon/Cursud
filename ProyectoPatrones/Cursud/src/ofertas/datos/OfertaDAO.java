/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ofertas.datos;

/**
 *
 * @author CARLOS SANTIAGO ROJAS MORENO
 */
import ofertas.negocio.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import ofertas.util.ServiceLocator;
import java.util.ArrayList;


public class OfertaDAO {
    
     public OfertaDAO(){
       
    }
    
    public ArrayList<Curso> buscarOferta(){
        ArrayList<Curso> cursos = new ArrayList<>();
        
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT n_nomcurso,n_oferta ,N_DIRIMAGEN FROM curso WHERE n_oferta not like 0");       
        ServiceLocator myConn = ServiceLocator.getInstance();
       try {
        Connection conn = myConn.tomarConexion();
        PreparedStatement ps = conn.prepareStatement(sql.toString());
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Curso curso = new Curso();
            curso.setNombre(rs.getString(1));
            curso.setOferta(rs.getInt(2));
            curso.setDirImagen(rs.getString(3));
            
            cursos.add(curso);
        }
        
         
      }
      catch(SQLException ex){
          System.out.println("No se puede ver las ofertas "+ex.getMessage());
         ex.printStackTrace();
         return cursos = null;
      }
        myConn.liberarConexion();
        
        
        return cursos;
        
    }
    
    
    
     
}
