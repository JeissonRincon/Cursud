package app.VistaPrincipal;

import app.Componentes.BotonesLog.ConLoggeoComponent;
import app.Componentes.BotonesLog.SinLoggeoComponent;
import app.Componentes.QuienesSomos.InformativaComponent;
import app.Componentes.QuienesSomos.TarjetaComponent;

/**
 *
 * @author Jeisson
 */
public class VistaPrincipalComponent {
    
    private VistaPrincipalTemplate vistaPrincipalTemplate;
    
    private SinLoggeoComponent sinLoggeoComponent;
    private ConLoggeoComponent conLoggeoComponent;
    private TarjetaComponent tarjetaComponent;
    private InformativaComponent informativaComponent;
    
    
    public VistaPrincipalComponent(){
    
        this.vistaPrincipalTemplate= new VistaPrincipalTemplate(this);
        
    }
    
    public void mostrarComponentes(String Opcion){
        
        vistaPrincipalTemplate.getpBotonesLog().removeAll();
    
        switch(Opcion){
        
            case "Sin Loggeo":
                if(this.sinLoggeoComponent == null)
                    this.sinLoggeoComponent = new SinLoggeoComponent(this);
                vistaPrincipalTemplate.getpBotonesLog().add(sinLoggeoComponent.getSinLoggeoTemplate());
                break;
            case "Con Loggeo":
                if(this.conLoggeoComponent == null)
                    this.conLoggeoComponent = new ConLoggeoComponent(this);
                vistaPrincipalTemplate.getpBotonesLog().add(conLoggeoComponent.getConLoggeoTemplate());
                break;
            case "Inicio":
                if(this.sinLoggeoComponent == null)
                    this.sinLoggeoComponent = new SinLoggeoComponent(this);
                
                vistaPrincipalTemplate.getpBotonesLog().add(sinLoggeoComponent.getSinLoggeoTemplate());
                break;
        }
        
        vistaPrincipalTemplate.repaint();
        
    }

    public VistaPrincipalTemplate getVistaPrincipalTemplate() {
        return vistaPrincipalTemplate;
    }
    
    
}
