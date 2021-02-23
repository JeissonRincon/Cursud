/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagos.datos;

/**
 *
 * @author CARLOS SANTIAGO ROJAS MORENO
 */

import pagos.negocio.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pagos.util.ServiceLocator;


public class PagosDAO {
    
     public PagosDAO(){
       
    }
    
    public int buscarcuentaysaldo(String Curso, int Cuenta){
        Curso curso = new Curso();
        StringBuilder sql = new StringBuilder();
        StringBuilder sql2 = new StringBuilder();
        sql.append("SELECT q_saldo  FROM cuenta WHERE k_numcuenta = "+Cuenta);       
        ServiceLocator myConn = ServiceLocator.getInstance();
       try {
        Connection conn = myConn.tomarConexion();
        PreparedStatement ps = conn.prepareStatement(sql.toString());
        ResultSet rs = ps.executeQuery();
        rs.next();
        int saldo = rs.getInt(1);
        sql2.append("SELECT n_precio  FROM curso WHERE n_nomcurso = '"+Curso+"'");
        PreparedStatement ps2 = conn.prepareStatement(sql2.toString());
        ResultSet rs2 = ps2.executeQuery();
        rs2.next();
        int precio = rs2.getInt(1);
        if(saldo - precio >= 0){
            //aqui se haria la compra
        }else{
            return 3;
        }
      }
      catch(SQLException ex){
          System.out.println("No se puede ver el usuario "+ex.getMessage());
         ex.printStackTrace();
         return  1;
      }
        myConn.liberarConexion();
        
        
        return 0;
        
    }
    
    
     
}
