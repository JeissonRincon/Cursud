
package app.Componentes.BotonesLog;

import app.VistaPrincipal.VistaPrincipalComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jeisson
 */
public class ConLoggeoComponent implements ActionListener{
    
    private ConLoggeoTemplate conLoggeoTemplate;
    private VistaPrincipalComponent vistaPrincipalComponent;
    
    public ConLoggeoComponent(VistaPrincipalComponent vistaPrincipalComponent){
    
        this.conLoggeoTemplate=new ConLoggeoTemplate(this);
        this.vistaPrincipalComponent=vistaPrincipalComponent;
    }

    public ConLoggeoTemplate getConLoggeoTemplate() {
        return conLoggeoTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==conLoggeoTemplate.getbDesLoggeo()){
            vistaPrincipalComponent.mostrarComponentes("Sin Loggeo");
        }
    }
    
}
