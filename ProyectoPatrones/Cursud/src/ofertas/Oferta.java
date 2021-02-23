/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ofertas;

import java.util.ArrayList;
import ofertas.datos.LoginDAO;
import ofertas.datos.OfertaDAO;
import ofertas.negocio.Curso;

/**
 *
 * @author CARLOS SANTIAGO ROJAS MORENO
 */
public class Oferta {
    public ArrayList<String> buscarofertas(){
    
       //le llega el usuario y contraseña y necesito validar que exista en la base y coincidan sus contraseñas
       // si coincide qe retorne true sino false
        LoginDAO loguearDB = new LoginDAO(); 
        OfertaDAO consulta = new OfertaDAO();
        loguearDB.logearse();
        ArrayList<String> cursosnuevos = new ArrayList<>();
        ArrayList<Curso> cursos = consulta.buscarOferta();
        for (int i = 0; i < cursos.size(); i++) {
            cursosnuevos.add(cursos.get(i).getNombre());
            cursosnuevos.add(""+cursos.get(i).getOferta());
            cursosnuevos.add(cursos.get(i).getDirImagen());
        }
        return cursosnuevos;
       
    }
}
