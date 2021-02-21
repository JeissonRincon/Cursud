
package app;

import app.VistaPrincipal.VistaPrincipalComponent;

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
    
    
    public boolean RegistrarUsuario(String nombre, String apellido, String Usuario, String Contrasena){
    
        //le llega la informacion del usuario a registrar le dejo a jurisdiccion si quiera hacer validacion
        //de que ya existe el usuario o no si no la quiere hacer quite el return y el boolean
        
        return true;
    }
    
    public boolean ValidarLogin(String Usuario, String Contrasena){
    
       //le llega el usuario y contraseña y necesito validar que exista en la base y coincidan sus contraseñas
       // si coincide qe retorne true sino false
       return true;
       
    }
    
    public void mostrarMisCursos(String Usuario){
        
        vista.getVistaPrincipalTemplate().getCursero().removeAll();
        
        //se hace la consulta y en un ciclo va llamando 
        
        //vista.crearCurso(i, nombre, descripcion, precio,dirImagen);
    
    
    }
    
    public int validarCompra(String Curso, int Cuenta){
        
        //le llega el curso y cuenta, se debe mirar si el saldo en la cuenta dada puede comprar el curso, 
        // si no le alcanza el saldo retorna 3
        
        //debe validar que la cuenta exista, si no existe retorna 1
        
        //debe validar que el curso no lo tenga ya el usuario, si ya lo tiene retorna 2
        
        //si puede debe restar el saldo y crear el registro de usuario y curso, si todo sale en orden retornar 0
        
        return 1;
    }
    
    public void mostrarOfertas(){
    
        //se hace la consulta y en un ciclo va llamando 
        //vista.crearOferta(iterador, nombre, descuento,dirImagen);
        
    }
    
    public void mostrarCursos(){
    
        vista.getVistaPrincipalTemplate().getCursero().removeAll();
        //se hace la consulta y en un ciclo va llamando
        //vista.crearCurso(i, nombre, descripcion, precio, dirImagen);
    }
    
    public void buscarCurso(String nombre){
        
        vista.getVistaPrincipalTemplate().getCursero().removeAll();
    
        //consultar y una vez llamado
        //vista.crearCurso(0, nombre, descripcion, precio,dirImagen);
        
    }
    
}
