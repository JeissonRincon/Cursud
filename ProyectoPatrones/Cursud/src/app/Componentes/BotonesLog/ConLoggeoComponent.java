
package app.Componentes.BotonesLog;

import app.Controlador;
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
    private Controlador control;
    
    public ConLoggeoComponent(VistaPrincipalComponent vistaPrincipalComponent, Controlador control){
    
        this.conLoggeoTemplate=new ConLoggeoTemplate(this);
        this.vistaPrincipalComponent=vistaPrincipalComponent;
        this.control=control;
    }

    public ConLoggeoTemplate getConLoggeoTemplate() {
        return conLoggeoTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==conLoggeoTemplate.getbDesLoggeo()){
            vistaPrincipalComponent.mostrarComponentes("Sin Loggeo");
            vistaPrincipalComponent.getVistaPrincipalTemplate().getlUsuario().setText("");
            control.mostrarCursos();
        }
        
        if(e.getSource()==conLoggeoTemplate.getbMisCursos()){
            control.mostrarMisCursos(vistaPrincipalComponent.getVistaPrincipalTemplate().getlUsuario().getText());
        }
    }
    
}
