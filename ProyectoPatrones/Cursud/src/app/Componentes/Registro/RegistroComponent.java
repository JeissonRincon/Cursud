
package app.Componentes.Registro;

import app.Controlador;
import app.VistaPrincipal.AnuncioComponent;
import app.VistaPrincipal.VistaPrincipalComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jeisson
 */
public class RegistroComponent implements ActionListener{
    
    private RegistroTemplate registroTemplate;
    private VistaPrincipalComponent vistaPrincipalComponent;
    private Controlador control;
    private AnuncioComponent anuncio;
    
    private boolean usuRegistrado;
    
    public RegistroComponent(VistaPrincipalComponent vistaPrincipalComponent, Controlador controlador){
    
        this.registroTemplate= new RegistroTemplate(this);
        this.vistaPrincipalComponent=vistaPrincipalComponent;
        this.control=controlador;
    }
    
    public RegistroTemplate getRegistroTemplate() {
        return registroTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==registroTemplate.getbRegistrar()){
            //Se hacen las validaciones
            if(registroTemplate.gettNombre().getText().length()==0 || 
                    registroTemplate.gettApellido().getText().length()==0 ||
                    registroTemplate.gettUsuario().getText().length()==0 || 
                    registroTemplate.gettContra().getText().length()==0 ||
                    registroTemplate.gettContra2().getText().length()==0){
                registroTemplate.getlMensaje().setText("Porfavor llenar todos los campos");
            }else{
                if(registroTemplate.gettContra().getText().equals(registroTemplate.gettContra2().getText())){
                    
                    usuRegistrado=control.RegistrarUsuario(registroTemplate.gettNombre().getText(),
                            registroTemplate.gettApellido().getText(),
                            registroTemplate.gettUsuario().getText(),
                            registroTemplate.gettContra().getText());
                    
                    if(usuRegistrado==true){
                        
                        this.vistaPrincipalComponent.getVistaPrincipalTemplate().setVisible(true);
                        if(anuncio==null){
                            anuncio=new AnuncioComponent();
                        }else{
                            anuncio.getAnuncioTemplate().setVisible(true);
                        }
                        anuncio.getAnuncioTemplate().getlMensaje().setText("<html><div align='justify'>"+"USUARIO CREADO DE FORMA EXITOSA"+"</div></html>");
                        this.registroTemplate.setVisible(false);
                        
                    }else{
                        this.vistaPrincipalComponent.getVistaPrincipalTemplate().setVisible(true);
                        if(anuncio==null){
                            anuncio=new AnuncioComponent();
                        }else{
                            anuncio.getAnuncioTemplate().setVisible(true);
                        }
                        anuncio.getAnuncioTemplate().getlMensaje().setText("<html><div align='justify'>"+"NO SE PUDO CREAR EL USUARIO"+"</div></html>");
                        this.registroTemplate.setVisible(false);
                    }
                }else{
                    registroTemplate.getlMensaje().setText("Las contraseñas no coinciden");
                }
            
            }
            
            
        }
        if(e.getSource()==registroTemplate.getbVolver()){
            
            this.vistaPrincipalComponent.getVistaPrincipalTemplate().setVisible(true);
            this.registroTemplate.setVisible(false);
        }
        
    }
    
    public void limpiarCampos(){
    
        this.registroTemplate.gettNombre().setText("");
        this.registroTemplate.gettApellido().setText("");
        this.registroTemplate.gettUsuario().setText("");
        this.registroTemplate.gettContra().setText("");
        this.registroTemplate.gettContra2().setText("");
        this.registroTemplate.getlMensaje().setText("");
        
    
    }
    
}
