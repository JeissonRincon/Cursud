/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package likeCusos;

import java.util.ArrayList;

import com.cableado.Simil;

import likeCusos.datos.CursosLikeDAO;
import likeCusos.datos.LoginDAO;
import likeCusos.negocio.Curso;

/**
 *
 * @author CARLOS SANTIAGO ROJAS MORENO
 */
public class LikeCursos implements Simil{
    public ArrayList<String> buscarCursos(String usuario){
    
       //le llega el usuario y contraseña y necesito validar que exista en la base y coincidan sus contraseñas
       // si coincide qe retorne true sino false
       LoginDAO loguearDB = new LoginDAO(); 
        CursosLikeDAO consulta = new CursosLikeDAO();
        loguearDB.logearse();
        ArrayList<String> cursosnuevos = new ArrayList<>();
        ArrayList<Curso> cursos = consulta.buscarCursoLike(usuario);
        for (int i = 0; i < cursos.size(); i++) {
            cursosnuevos.add(cursos.get(i).getNombre());
            cursosnuevos.add(cursos.get(i).getDescripcion());
            cursosnuevos.add(cursos.get(i).getDirImagen());
            cursosnuevos.add(""+(cursos.get(i).getPrecio()));
        }
        return cursosnuevos;
       
    }
}
