
package app.VistaPrincipal;

import app.ServiciosGraficos.ObjetosGraficosService;
import app.ServiciosGraficos.RecursosService;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Jeisson
 */
public class AnuncioTemplate extends JFrame{
    
    private RecursosService sRecursos;
    private ObjetosGraficosService sObjetosGraficos;
    
    private AnuncioComponent anuncioComponent;
    
    private JLabel lMensaje;
    private JButton bOk;
    
    public AnuncioTemplate(AnuncioComponent anuncioComponent){
        
        sRecursos = RecursosService.getService();
        sObjetosGraficos = ObjetosGraficosService.getService();
        
        this.anuncioComponent=anuncioComponent;
        this.anuncioComponent.getClass();
    
        lMensaje=sObjetosGraficos.construirJLabel("", 20, 40, 150, 50, null, 
                Color.black, null, sRecursos.getFontIniciarSesion(), "c");
        this.add(lMensaje);
        
        bOk = sObjetosGraficos.construirJButton("OK", 20, 120, 100, 30,sRecursos.getcMano(), null, 
                sRecursos.getFontSubtitulos(), sRecursos.getColorVerdoso(), Color.black, sRecursos.getBorderGris(), "c", true);
        bOk.addActionListener(anuncioComponent);
        this.add(bOk);
        
        
        this.setSize(200, 200);
        this.setLocationRelativeTo(this);       
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(sRecursos.getColorAmarillento());
        this.setLayout(null);
        this.setVisible(true);
        
    
    }

    public JLabel getlMensaje() {
        return lMensaje;
    }

    public JButton getbOk() {
        return bOk;
    }
    
    
    
    
    
}
