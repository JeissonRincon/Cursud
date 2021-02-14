
package app.Componentes.Registro;

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
    
    public RegistroComponent(VistaPrincipalComponent vistaPrincipalComponent){
    
        this.registroTemplate= new RegistroTemplate(this);
        this.vistaPrincipalComponent=vistaPrincipalComponent;
    }
    
    public RegistroTemplate getRegistroTemplate() {
        return registroTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==registroTemplate.getbRegistrar()){
            //Se hacen las validaciones
            
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
        
    
    }
    
}
