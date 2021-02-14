
package app.Componentes.Loggeo;

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
    
    public LoginComponent(VistaPrincipalComponent vistaPrincipalComponent){
    
        this.loginTemplate=new LoginTemplate(this);
        this.vistaPrincipalComponent=vistaPrincipalComponent;
        
        
    }

    public LoginTemplate getLoginTemplate() {
        return loginTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loginTemplate.getbVolver()){
            if(vistaPrincipalComponent==null){
                this.vistaPrincipalComponent= new VistaPrincipalComponent();
            }else{
                this.vistaPrincipalComponent.getVistaPrincipalTemplate().setVisible(true);
            }
            
        }
        if(e.getSource()==loginTemplate.getbEntrar()){
            
            //Logica para validar
        
        }
    }
    
    public void limpiarCampos(){
    
        this.loginTemplate.getlMensaje().setText("");
        this.loginTemplate.gettUsuario().setText("");
        this.loginTemplate.gettContra().setText("");
    }
    
    
    
}
