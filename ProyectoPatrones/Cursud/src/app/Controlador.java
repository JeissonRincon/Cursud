 
package app;

import BuscarCursos.BuscarCursos;
import Login.Loguear;
import Registrar.Registrar;
import app.VistaPrincipal.VistaPrincipalComponent;
import java.util.ArrayList;
import likeCusos.LikeCursos;
import mostrarCursos.MostrarCursos;
import ofertas.Oferta;
import pagos.pagar;

/**
 *
 * @author Jeisson
 */
public class Controlador {
    
    private VistaPrincipalComponent vista;
    
    public Controlador(){
    
        if(vista==null){
            vista= new VistaPrincipalComponent(this);}
    }
    
    
    public boolean RegistrarUsuario(String nombre, String apellido, String usuario, String Contrasena){
        
        //le llega la informacion del usuario a registrar le dejo a jurisdiccion si quiera hacer validacion
        //de que ya existe el usuario o no si no la quiere hacer quite el return y el boolean
        Registrar registrar = new Registrar();
        return registrar.RegistrarUsuario(nombre, apellido, usuario, Contrasena);
    }
    
    public boolean ValidarLogin(String usuario, String Contrasena){
    
       //le llega el usuario y contraseña y necesito validar que exista en la base y coincidan sus contraseñas
       // si coincide qe retorne true sino false
       Loguear log = new Loguear();
       return log.ValidarLogin(usuario, Contrasena);
       
    }
    
    public void mostrarMisCursos(String Usuario){
        
        vista.getVistaPrincipalTemplate().getCursero().removeAll();
        
        //se hace la consulta y en un ciclo va llamando 
        
        //vista.crearCurso(i, nombre, descripcion, precio,dirImagen);
        BuscarCursos bus = new BuscarCursos();
        ArrayList<String> cursos = bus.buscarCursos(Usuario);
        int contador = 0;
        for (int i = 0; i < cursos.size(); i=i+4) {
            vista.crearCurso(contador, cursos.get(i), cursos.get(i+1), Integer.parseInt(cursos.get(i+3)),cursos.get(i+2));
            contador++;
        }
    
    }
    
    public int validarCompra(String Curso, int Cuenta){
        
        //le llega el curso y cuenta, se debe mirar si el saldo en la cuenta dada puede comprar el curso, 
        // si no le alcanza el saldo retorna 3
        
        //debe validar que la cuenta exista, si no existe retorna 1
        pagar pag = new pagar();
        
        //debe validar que el curso no lo tenga ya el usuario, si ya lo tiene retorna 2
        
        //si puede debe restar el saldo y crear el registro de usuario y curso, si todo sale en orden retornar 0
        
        return pag.pagar(Curso, Cuenta);
    }
    
    public void mostrarOfertas(){
        
        //se hace la consulta y en un ciclo va llamando 
        //vista.crearOferta(iterador, nombre, descuento,dirImagen);
        Oferta ofe = new Oferta();
        ArrayList<String> cursos = ofe.buscarofertas();
        int contador = 0;
        for (int i = 0; i < cursos.size(); i=i+3) {
            vista.crearOferta(contador, cursos.get(i), Integer.parseInt(cursos.get(i+1)),cursos.get(i+2));
            contador++;
        }
    }
    
    public void mostrarCursos(){
    
        vista.getVistaPrincipalTemplate().getCursero().removeAll();
        MostrarCursos bus = new MostrarCursos();
        ArrayList<String> cursos = bus.buscarCursos();
        int contador = 0;
        for (int i = 0; i < cursos.size(); i=i+4) {
            vista.crearCurso(contador, cursos.get(i), cursos.get(i+1), Integer.parseInt(cursos.get(i+3)),cursos.get(i+2));
            contador++;
        }
    }
    
    public void buscarCurso(String nombre){
        
        vista.getVistaPrincipalTemplate().getCursero().removeAll();
        
        //consultar y una vez llamado
        //vista.crearCurso(0, nombre, descripcion, precio,dirImagen);
        LikeCursos bus = new LikeCursos();
        ArrayList<String> cursos = bus.buscarCursos(nombre);
        int contador = 0;
        for (int i = 0; i < cursos.size(); i=i+4) {
            vista.crearCurso(contador, cursos.get(i), cursos.get(i+1), Integer.parseInt(cursos.get(i+3)),cursos.get(i+2));
            contador++;
        }
    }
    
}
