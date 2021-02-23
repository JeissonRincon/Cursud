/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mostrarCursos;

import java.util.ArrayList;

import com.cableado.BibliotecaCursos;

import mostrarCursos.datos.CursosOfertaDAO;
import mostrarCursos.datos.LoginDAO;
import mostrarCursos.negocio.Curso;

/**
 *
 * @author CARLOS SANTIAGO ROJAS MORENO
 */
public class MostrarCursos implements BibliotecaCursos{
    public ArrayList<String> buscarCursos(){
    
       //le llega el usuario y contraseña y necesito validar que exista en la base y coincidan sus contraseñas
       // si coincide qe retorne true sino false
       LoginDAO loguearDB = new LoginDAO(); 
        CursosOfertaDAO consulta = new CursosOfertaDAO();
        loguearDB.logearse();
        ArrayList<String> cursosnuevos = new ArrayList<>();
        ArrayList<Curso> cursos = consulta.buscarCursos();
        for (int i = 0; i < cursos.size(); i++) {
            cursosnuevos.add(cursos.get(i).getNombre());
            cursosnuevos.add(cursos.get(i).getDescripcion());
            cursosnuevos.add(cursos.get(i).getDirImagen());
            cursosnuevos.add(""+(cursos.get(i).getPrecio()));
        }
        return cursosnuevos;
       
    }
}
