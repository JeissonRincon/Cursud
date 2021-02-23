/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuscarCursos;

import BuscarCursos.datos.CursosDAO;
import BuscarCursos.datos.LoginDAO;
import BuscarCursos.negocio.Curso;
import java.util.ArrayList;

/**
 *
 * @author CARLOS SANTIAGO ROJAS MORENO
 */
public class BuscarCursos {
    public ArrayList<String> buscarCursos(String usuario){
    
       //le llega el usuario y contraseña y necesito validar que exista en la base y coincidan sus contraseñas
       // si coincide qe retorne true sino false
       LoginDAO loguearDB = new LoginDAO(); 
        CursosDAO consulta = new CursosDAO();
        loguearDB.logearse();
        ArrayList<String> cursosnuevos = new ArrayList<>();
        ArrayList<Curso> cursos = consulta.buscarUsuario(usuario);
        for (int i = 0; i < cursos.size(); i++) {
            cursosnuevos.add(cursos.get(i).getNombre());
            cursosnuevos.add(cursos.get(i).getDescripcion());
            cursosnuevos.add(cursos.get(i).getDirImagen());
            cursosnuevos.add(""+(cursos.get(i).getPrecio()));
        }
        return cursosnuevos;
       
    }
}
