
package app.Componentes.BotonesLog;

import app.ServiciosGraficos.ObjetosGraficosService;
import app.ServiciosGraficos.RecursosService;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Jeisson
 */
public class SinLoggeoTemplate extends JPanel{
    
    private ObjetosGraficosService sObjG;
    private RecursosService sRecursos;
    
    private SinLoggeoComponent sinLoggeoComponent;
    
    private JButton bRegistro, bLoggeo;
    
    public SinLoggeoTemplate(SinLoggeoComponent sinLoggeoComponent){
    
        sObjG = ObjetosGraficosService.getService();
        sRecursos = RecursosService.getService();
        this.sinLoggeoComponent=sinLoggeoComponent;
        this.sinLoggeoComponent.getClass();
        
        this.crearBotones();
        
        this.setSize(185, 50);
        this.setBackground(Color.LIGHT_GRAY);
        this.setLayout(null);
        this.setVisible(true);
    
    }
    
    public void crearBotones(){
    
        bRegistro = sObjG.construirJButton("Sign up", 10, 10, 70, 30,sRecursos.getcMano()
                , null, sRecursos.getFontIniciarSesion(), sRecursos.getColorVerdoso(), sRecursos.getColorNegro(), sRecursos.getBorderGris(), "c", true);
        bRegistro.addActionListener(sinLoggeoComponent);
        this.add(bRegistro);
        
        bLoggeo = sObjG.construirJButton("Log in", 90, 10, 70, 30,sRecursos.getcMano()
                , null, sRecursos.getFontIniciarSesion(), sRecursos.getColorVerdoso(), Color.black, sRecursos.getBorderGris(), "c", true);
        bLoggeo.addActionListener(sinLoggeoComponent);
        this.add(bLoggeo);
    
    }

    public JButton getbRegistro() {
        return bRegistro;
    }

    public JButton getbLoggeo() {
        return bLoggeo;
    }
    
    
    
}
