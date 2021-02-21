
package app.Componentes.BotonesLog;

import app.Componentes.Loggeo.LoginComponent;
import app.Componentes.Registro.RegistroComponent;
import app.Controlador;
import app.VistaPrincipal.VistaPrincipalComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jeisson
 */
public class SinLoggeoComponent implements ActionListener{
    
    private SinLoggeoTemplate sinLoggeoTemplate;
    private VistaPrincipalComponent vistaPrincipalComponent;
    private RegistroComponent registroComponent;
    private LoginComponent loginComponent;
    private Controlador controlador;
    
    
    public SinLoggeoComponent(VistaPrincipalComponent vistaPrincipalComponent, Controlador controlador){
    
        this.sinLoggeoTemplate=new SinLoggeoTemplate(this);
        this.vistaPrincipalComponent=vistaPrincipalComponent;
        this.controlador=controlador;
    }

    public SinLoggeoTemplate getSinLoggeoTemplate() {
        return sinLoggeoTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==sinLoggeoTemplate.getbLoggeo()){
            
            if(loginComponent==null){
                this.loginComponent=new LoginComponent(vistaPrincipalComponent,controlador);
            }
            else{
                this.loginComponent.getLoginTemplate().setVisible(true);
            }
            this.loginComponent.limpiarCampos();
        }
        
        if(e.getSource()==sinLoggeoTemplate.getbRegistro()){
            if(registroComponent==null){
                this.registroComponent=new RegistroComponent(vistaPrincipalComponent,controlador);
            }else{
                this.registroComponent.getRegistroTemplate().setVisible(true);
            }
            this.registroComponent.limpiarCampos();
            
        
        }
        
        vistaPrincipalComponent.getVistaPrincipalTemplate().setVisible(false);
            
    
    }
    
    
    
}
