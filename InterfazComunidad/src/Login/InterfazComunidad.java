package Login;

import javax.swing.JOptionPane;

import com.cableado.Plataforma;

import Login.datos.LoginDAO;
import Login.datos.UsuarioDAO;

public class InterfazComunidad implements Plataforma {


	  @Override
	    public boolean ValidarLogin(String usuario, String Contrasena){

	       //le llega el usuario y contraseña y necesito validar que exista en la base y coincidan sus contraseñas
	       // si coincide qe retorne true sino false
	       LoginDAO loguearDB = new LoginDAO();
	        UsuarioDAO consulta = new UsuarioDAO();
	        loguearDB.logearse();
	        return consulta.buscarUsuario(usuario, Contrasena);

	    }

}
