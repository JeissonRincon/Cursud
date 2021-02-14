
package app.Componentes.Loggeo;

import app.ServiciosGraficos.ObjetosGraficosService;
import app.ServiciosGraficos.RecursosService;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Jeisson
 */
public class LoginTemplate extends JFrame{
    
    private RecursosService sRecursos;
    private ObjetosGraficosService sObjetosGraficos;
    
    private LoginComponent loginComponent;
    
    private JLabel lUsuario, lContra, lMensaje;
    private JTextField tUsuario, tContra;
    private JButton bEntrar, bVolver;
    
    public LoginTemplate(LoginComponent loginComponent){
        
        sRecursos = RecursosService.getService();
        sObjetosGraficos = ObjetosGraficosService.getService();
        
        this.loginComponent=loginComponent;
        this.loginComponent.getClass();
        
        
        this.crearLabels();
        this.crearCuadrosTextos();
        this.crearBotones();
        
        this.setSize(300, 300);
        this.setLocationRelativeTo(this);       
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(sRecursos.getColorAmarillento());
        this.setLayout(null);
        this.setVisible(true);
    
    }
    
    public void crearLabels(){
        
        lUsuario=sObjetosGraficos.construirJLabel("USUARIO", 20, 40, 100, 30, null, 
                Color.black, null, sRecursos.getFontLogeo(), "l");
        this.add(lUsuario);
        
        lContra=sObjetosGraficos.construirJLabel("CONTRASEÑA", 20, 80, 100, 30, null, 
                Color.black, null, sRecursos.getFontLogeo(), "l");
        this.add(lContra);
    
        lMensaje=sObjetosGraficos.construirJLabel(null, 20, 120, 200, 30, null,
                Color.red, null, sRecursos.getFontLogeo(), "c");
        this.add(lMensaje);
        
    }
    
    public void crearCuadrosTextos(){
    
        tUsuario = sObjetosGraficos.construirJTextField(null, 140, 40, 100, 30, 
                null, Color.black, null, sRecursos.getFontLogeo(), sRecursos.getBorderInferiorGris(), "c");
        this.add(tUsuario);
        
        tContra = sObjetosGraficos.construirJPasswordField(null, 140, 80, 100, 30, 
                null, Color.black, null, sRecursos.getFontLogeo(), sRecursos.getBorderInferiorGris(), "c");
        this.add(tContra);
    }
    
    public void crearBotones(){
        
        bEntrar = sObjetosGraficos.construirJButton("Entrar", 150, 160, 100, 30,sRecursos.getcMano(), null,
                sRecursos.getFontSubtitulos(), sRecursos.getColorVerdoso(), Color.BLACK, sRecursos.getBorderGris(), "c", true);
        bEntrar.addActionListener(loginComponent);
        this.add(bEntrar);
        
        bVolver = sObjetosGraficos.construirJButton("VOLVER", 20, 160, 100, 30,sRecursos.getcMano(), null, 
                sRecursos.getFontSubtitulos(), sRecursos.getColorVerdoso(), Color.black, sRecursos.getBorderGris(), "c", true);
        bVolver.addActionListener(loginComponent);
        this.add(bVolver);
    
    
    }

    public JButton getbEntrar() {
        return bEntrar;
    }

    public JButton getbVolver() {
        return bVolver;
    }

    public JLabel getlMensaje() {
        return lMensaje;
    }

    public JTextField gettUsuario() {
        return tUsuario;
    }

    public JTextField gettContra() {
        return tContra;
    }
    
    
    
    
    
}
