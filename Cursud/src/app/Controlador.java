
package app;


import app.VistaPrincipal.VistaPrincipalComponent;
import java.util.ArrayList;

import com.cableado.BibliotecaCursos;
import com.cableado.Formulario;
import com.cableado.Mensajeria;
import com.cableado.Plataforma;
import com.cableado.Publicidad;
import com.cableado.Recaudos;
import com.cableado.Simil;
import com.utilidades.Cargador;


/**
 *
 * @author CARLOS SANTIAGO ROJAS MORENO
 */
public class Controlador {

    private VistaPrincipalComponent vista;

    public Controlador(){

        if(vista==null){
            vista= new VistaPrincipalComponent(this);}
    }
    public boolean ValidarLogin(String usuario, String Contrasena){
    	boolean validador = false;
    	Cargador cf  = new Cargador("front");
		try {
			Class cls = cf.getClase(Plataforma.class.getName());
			if(cls!=null) {
			   Plataforma ic  = (Plataforma)cls.newInstance();
			   validador = ic.ValidarLogin(usuario, Contrasena);			   
			}
		} catch (Exception e) {			
			e.printStackTrace();
		}
        return validador;

     }

    public boolean RegistrarUsuario(String nombre, String apellido, String usuario, String Contrasena){

        //le llega la informacion del usuario a registrar le dejo a jurisdiccion si quiera hacer validacion
        //de que ya existe el usuario o no si no la quiere hacer quite el return y el boolean
        Cargador cb  = new Cargador("back");
        boolean validar = false;
		try {
			Class cls=cb.getClase(Formulario.class.getName());
			if(cls!=null) {
				Formulario form  = (Formulario)cls.newInstance();			
			   validar = form.RegistrarUsuario(nombre, apellido, usuario, Contrasena);
			}
		} catch (Exception e) {			
			e.printStackTrace();
		}
        return validar;
    }

    

    public void mostrarMisCursos(String Usuario){

        vista.getVistaPrincipalTemplate().getCursero().removeAll();

        //se hace la consulta y en un ciclo va llamando

        //vista.crearCurso(i, nombre, descripcion, precio,dirImagen);
        Cargador cf  = new Cargador("front");
        try {
			Class cls = cf.getClase(Mensajeria.class.getName());
			if(cls!=null) {
				Mensajeria me  = (Mensajeria)cls.newInstance();
				ArrayList<String> cursos = me.buscarCursos(Usuario);
		        int contador = 0;
		        for (int i = 0; i < cursos.size(); i=i+4) {
		            vista.crearCurso(contador, cursos.get(i), cursos.get(i+1), Integer.parseInt(cursos.get(i+3)),cursos.get(i+2));
		            contador++;
		        }
			}
		} catch (Exception e) {			
			e.printStackTrace();
		}

    }

    public int validarCompra(String Curso, int Cuenta){

        //le llega el curso y cuenta, se debe mirar si el saldo en la cuenta dada puede comprar el curso,
        // si no le alcanza el saldo retorna 3

        //debe validar que la cuenta exista, si no existe retorna 1

        //debe validar que el curso no lo tenga ya el usuario, si ya lo tiene retorna 2

        //si puede debe restar el saldo y crear el registro de usuario y curso, si todo sale en orden retornar 0
    	Cargador cb  = new Cargador("back");
		
		
		int validar = 3;
		try {
			Class cls=cb.getClase(Recaudos.class.getName());
			if(cls!=null) {
				Recaudos re  = (Recaudos)cls.newInstance();			
			    validar = re.pagar(Curso, Cuenta);
			}
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
        return validar;
    }

    public void mostrarOfertas(){
    	Cargador cf  = new Cargador("front");
		try {
			Class cls = cf.getClase(Publicidad.class.getName());
			if(cls!=null) {
				Publicidad pu  = (Publicidad)cls.newInstance();
			   
		        ArrayList<String> cursos = pu.buscarofertas();
		        int contador = 0;
		        for (int i = 0; i < cursos.size(); i=i+3) {
		            vista.crearOferta(contador, cursos.get(i), Integer.parseInt(cursos.get(i+1)),cursos.get(i+2));
		            contador++;
		        }
			}
		} catch (Exception e) {			
			e.printStackTrace();
		}
        //se hace la consulta y en un ciclo va llamando
        //vista.crearOferta(iterador, nombre, descuento,dirImagen);
        
    }

    public void mostrarCursos(){

    	vista.getVistaPrincipalTemplate().getCursero().removeAll();
    	Cargador cb  = new Cargador("back");
		
		try {
			Class cls=cb.getClase(BibliotecaCursos.class.getName());
			if(cls!=null) {
				BibliotecaCursos bc  = (BibliotecaCursos)cls.newInstance();			
			    
			    ArrayList<String> cursos = bc.buscarCursos();
		        int contador = 0;
		        for (int i = 0; i < cursos.size(); i=i+4) {
		            vista.crearCurso(contador, cursos.get(i), cursos.get(i+1), Integer.parseInt(cursos.get(i+3)),cursos.get(i+2));
		            contador++;
		        }
			}
		} catch (Exception e) {			
			e.printStackTrace();
		}
        
    }

    public void buscarCurso(String nombre){
    	
        vista.getVistaPrincipalTemplate().getCursero().removeAll();
        Cargador cb  = new Cargador("back");
		
		try {
			Class cls=cb.getClase(Simil.class.getName());
			if(cls!=null) {
				Simil bc  = (Simil)cls.newInstance();			
			    
			    ArrayList<String> cursos = bc.buscarCursos(nombre);
		        int contador = 0;
		        for (int i = 0; i < cursos.size(); i=i+4) {
		            vista.crearCurso(contador, cursos.get(i), cursos.get(i+1), Integer.parseInt(cursos.get(i+3)),cursos.get(i+2));
		            contador++;
		        }
			}
		} catch (Exception e) {			
			e.printStackTrace();
		}
        //consultar y una vez llamado
        //vista.crearCurso(0, nombre, descripcion, precio,dirImagen);
        
    }

}
