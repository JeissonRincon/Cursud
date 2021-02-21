package app.VistaPrincipal;

import app.Componentes.BotonesLog.ConLoggeoComponent;
import app.Componentes.BotonesLog.SinLoggeoComponent;
import app.Componentes.Cursos.CursosComponent;
import app.Componentes.Ofertas.OfertasComponent;


import app.Componentes.QuienesSomos.TarjetaComponent;
import app.Controlador;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

/**
 *
 * @author Jeisson
 */
public class VistaPrincipalComponent implements ActionListener{
    
    private VistaPrincipalTemplate vistaPrincipalTemplate;
    
    private SinLoggeoComponent sinLoggeoComponent;
    private ConLoggeoComponent conLoggeoComponent;
    private TarjetaComponent tarjetaComponent;
    private CursosComponent cursosComponent;
    private OfertasComponent ofertasComponent;
    private Controlador controlador;
    
    private ImageIcon iAux;
    
    public VistaPrincipalComponent(Controlador controlador){
        
        this.controlador=controlador;
        this.vistaPrincipalTemplate= new VistaPrincipalTemplate(this);
        this.mostrarComponentes("Inicio");
        
    }
    
    public void mostrarComponentes(String Opcion){
        
        vistaPrincipalTemplate.getpBotonesLog().removeAll();
    
        switch(Opcion){
        
            case "Sin Loggeo":
                if(this.sinLoggeoComponent == null)
                    this.sinLoggeoComponent = new SinLoggeoComponent(this,controlador);
                vistaPrincipalTemplate.getpBotonesLog().add(sinLoggeoComponent.getSinLoggeoTemplate());
                break;
            case "Con Loggeo":
                if(this.conLoggeoComponent == null)
                    this.conLoggeoComponent = new ConLoggeoComponent(this,controlador);
                vistaPrincipalTemplate.getpBotonesLog().add(conLoggeoComponent.getConLoggeoTemplate());
                break;
            case "Inicio":
                if(this.sinLoggeoComponent == null)
                    this.sinLoggeoComponent = new SinLoggeoComponent(this,controlador);
                
                vistaPrincipalTemplate.getpBotonesLog().add(sinLoggeoComponent.getSinLoggeoTemplate());
                
                break;
        }
        
        vistaPrincipalTemplate.repaint();
        
    }
    
    public void crearCurso(int i, String nombre, String descripcion, int precio, String dirImagen){
    
        iAux = new ImageIcon(dirImagen);
        
        vistaPrincipalTemplate.getCursero().add(new CursosComponent(this,i,nombre,descripcion,precio,iAux, controlador)
                .getCursosTemplate());
        
        vistaPrincipalTemplate.getCursero().setPreferredSize(new Dimension(350,((i+1)*100)));
        
        
        
    }
    
    public void crearOferta(int i, String nombre, int descuento, String dirImagen){
        
        iAux = new ImageIcon(dirImagen);
    
        vistaPrincipalTemplate.getpListOfertas().add(new OfertasComponent(i,nombre,descuento,iAux)
                .getOfertasTemplate());
        vistaPrincipalTemplate.getpListOfertas().setPreferredSize(new Dimension(195,((i+1)*70)));
        
    }

    public VistaPrincipalTemplate getVistaPrincipalTemplate() {
        return vistaPrincipalTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==vistaPrincipalTemplate.getbBuscar()){
            
            if(vistaPrincipalTemplate.gettBuscador().getText().length()==0){
                controlador.mostrarCursos();
            }else{
                controlador.buscarCurso(vistaPrincipalTemplate.gettBuscador().getText());
            }
        
        }
        
    }
    
    
}
