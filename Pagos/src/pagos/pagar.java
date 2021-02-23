/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagos;

import com.cableado.Recaudos;

import pagos.datos.LoginDAO;
import pagos.datos.PagosDAO;

/**
 *
 * @author CARLOS SANTIAGO ROJAS MORENO
 */
public class pagar implements Recaudos{
    public int pagar(String Curso, int Cuenta){
        
        LoginDAO loguearDB = new LoginDAO(); 
        PagosDAO consulta = new PagosDAO();
        loguearDB.logearse();
       return consulta.buscarcuentaysaldo(Curso,Cuenta);
    }
}
