/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Login.datos.LoginDAO;
import Login.datos.UsuarioDAO;

/**
 *
 * @author CARLOS SANTIAGO ROJAS MORENO
 */
public class Loguear {
    public boolean ValidarLogin(String usuario, String Contrasena){
    
       //le llega el usuario y contraseña y necesito validar que exista en la base y coincidan sus contraseñas
       // si coincide qe retorne true sino false
       LoginDAO loguearDB = new LoginDAO(); 
        UsuarioDAO consulta = new UsuarioDAO();
        loguearDB.logearse();
        return consulta.buscarUsuario(usuario, Contrasena);
       
    }
}
