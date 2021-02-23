
package app.Componentes.Loggeo;

import app.Controlador;
import app.VistaPrincipal.VistaPrincipalComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jeisson
 */
public class LoginComponent implements ActionListener{
    
    private LoginTemplate loginTemplate;
    private VistaPrincipalComponent vistaPrincipalComponent;
    private Controlador control;
    private boolean usuValido;
    
    public LoginComponent(VistaPrincipalComponent vistaPrincipalComponent, Controlador controlador){
    
        this.loginTemplate=new LoginTemplate(this);
        this.vistaPrincipalComponent=vistaPrincipalComponent;
        this.control=controlador;
        
        
    }

    public LoginTemplate getLoginTemplate() {
        return loginTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loginTemplate.getbVolver()){
            if(vistaPrincipalComponent==null){
                this.vistaPrincipalComponent= new VistaPrincipalComponent(control);
            }else{
                this.vistaPrincipalComponent.getVistaPrincipalTemplate().setVisible(true);
            }
            this.loginTemplate.setVisible(false);
            
        }
        if(e.getSource()==loginTemplate.getbEntrar()){
            
            if(loginTemplate.gettUsuario().getText().length()==0 ||
                    loginTemplate.gettContra().getText().length()==0){
                loginTemplate.getlMensaje().setText("POR FAVOR LLENE TODOS LOS CAMPOS");
            }else{
                
                usuValido=control.ValidarLogin(loginTemplate.gettUsuario().getText(), 
                        loginTemplate.gettContra().getText());
                
                if(usuValido==true){
                    vistaPrincipalComponent.mostrarComponentes("Con Loggeo");
                    vistaPrincipalComponent.getVistaPrincipalTemplate().getlUsuario().setText(loginTemplate.gettUsuario().getText());
                    if(vistaPrincipalComponent==null){
                        this.vistaPrincipalComponent= new VistaPrincipalComponent(control);
                    }else{
                        this.vistaPrincipalComponent.getVistaPrincipalTemplate().setVisible(true);
                    }
                    this.loginTemplate.setVisible(false);
                }else{
                    loginTemplate.getlMensaje().setText("USUARIO O CONTRASEÑA INVALIDOS");
                }
            
            }
        
        }
    }
    
    public void limpiarCampos(){
    
        this.loginTemplate.getlMensaje().setText("");
        this.loginTemplate.gettUsuario().setText("");
        this.loginTemplate.gettContra().setText("");
    }
    
    
    
}
