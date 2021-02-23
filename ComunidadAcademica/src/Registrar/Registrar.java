/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registrar;

import com.cableado.Formulario;

import Registrar.datos.LoginDAO;
import Registrar.datos.UsuarioDAO;

/**
 *
 * @author CARLOS SANTIAGO ROJAS MORENO
 */
public class Registrar implements Formulario{
    public boolean RegistrarUsuario(String nombre, String apellido, String usuario, String Contrasena){
        
        //le llega la informacion del usuario a registrar le dejo a jurisdiccion si quiera hacer validacion
        //de que ya existe el usuario o no si no la quiere hacer quite el return y el boolean
        LoginDAO loguearDB = new LoginDAO(); 
        UsuarioDAO consulta = new UsuarioDAO();
        loguearDB.logearse();
        return consulta.RegistrarUsuario(nombre, apellido, usuario, Contrasena);
    }
    
}
