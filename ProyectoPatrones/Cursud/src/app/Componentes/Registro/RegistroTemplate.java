package app.Componentes.Registro;

import app.ServiciosGraficos.ObjetosGraficosService;
import app.ServiciosGraficos.RecursosService;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Jeisson
 */
public class RegistroTemplate extends JFrame{
    
    private RecursosService sRecursos;
    private ObjetosGraficosService sObjetosGraficos;
    
    private RegistroComponent registroComponet;
    
    private JButton bRegistrar, bVolver;
    
    private JLabel lNombre, lApellido, lUsuario, lContra, lContra2;
    
    private JTextField tNombre, tApellido, tUsuario, tContra, tContra2;
     
    
    
    public RegistroTemplate(RegistroComponent registroComponent){
    
        sRecursos = RecursosService.getService();
        sObjetosGraficos = ObjetosGraficosService.getService();
        
        this.registroComponet=registroComponent;
        this.registroComponet.getClass();
        
        this.crearBotones();
        this.crearLabels();
        this.crearCuadrosTexto();
        
        this.setSize(300, 500);
        this.setLocationRelativeTo(this);       
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(sRecursos.getColorAmarillento());
        this.setLayout(null);
        this.setVisible(true);
        
        
    }
    
    
    public void crearCuadrosTexto(){
        
        tNombre = sObjetosGraficos.construirJTextField(null, 140, 40, 100, 30, 
                null, Color.black, null, sRecursos.getFontLogeo(), sRecursos.getBorderInferiorGris(), "c");
        this.add(tNombre);
        
        tApellido = sObjetosGraficos.construirJTextField(null, 140, 80, 100, 30, 
                null, Color.black, null, sRecursos.getFontLogeo(), sRecursos.getBorderInferiorGris(), "c");
        this.add(tApellido);
        
        tUsuario = sObjetosGraficos.construirJTextField(null, 140, 120, 100, 30, 
                null, Color.black, null, sRecursos.getFontLogeo(), sRecursos.getBorderInferiorGris(), "c");
        this.add(tUsuario);
        
        tContra = sObjetosGraficos.construirJPasswordField(null, 140, 160, 100, 30, 
                null, Color.black, null, sRecursos.getFontLogeo(), sRecursos.getBorderInferiorGris(), "c");
        this.add(tContra);
        
        tContra2 = sObjetosGraficos.construirJPasswordField(null, 140, 200, 100, 30, 
                null, Color.black, null, sRecursos.getFontLogeo(), sRecursos.getBorderInferiorGris(), "c");
        this.add(tContra2);
        
    }
    
    public void crearBotones(){
        
        bRegistrar = sObjetosGraficos.construirJButton("REGISTRAR", 150, 350, 100, 30,sRecursos.getcMano(), null,
                sRecursos.getFontSubtitulos(), sRecursos.getColorVerdoso(), Color.BLACK, sRecursos.getBorderGris(), "c", true);
        bRegistrar.addActionListener(registroComponet);
        this.add(bRegistrar);
        
        bVolver = sObjetosGraficos.construirJButton("VOLVER", 20, 350, 100, 30,sRecursos.getcMano(), null, 
                sRecursos.getFontSubtitulos(), sRecursos.getColorVerdoso(), Color.black, sRecursos.getBorderGris(), "c", true);
        bVolver.addActionListener(registroComponet);
        this.add(bVolver);
    }
    
    public void crearLabels(){
        
        lNombre=sObjetosGraficos.construirJLabel("NOMBRE", 20, 40, 100, 30, null, 
                Color.black, null, sRecursos.getFontLogeo(), "l");
        this.add(lNombre);
    
        lApellido=sObjetosGraficos.construirJLabel("APELLIDO", 20, 80, 100, 30, null, 
                Color.black, null, sRecursos.getFontLogeo(), "l");
        this.add(lApellido);
        
        lUsuario=sObjetosGraficos.construirJLabel("USUARIO", 20, 120, 100, 30, null,
                Color.black, null, sRecursos.getFontLogeo(), "l");
        this.add(lUsuario);
        
        lContra=sObjetosGraficos.construirJLabel("CONTRASEÑA", 20, 160, 100, 30, null,
                Color.black, null, sRecursos.getFontLogeo(), "l");
        this.add(lContra);
        
    }

    public JButton getbRegistrar() {
        return bRegistrar;
    }

    public JButton getbVolver() {
        return bVolver;
    } 

    public JTextField gettNombre() {
        return tNombre;
    }

    public JTextField gettApellido() {
        return tApellido;
    }

    public JTextField gettUsuario() {
        return tUsuario;
    }

    public JTextField gettContra() {
        return tContra;
    }

    public JTextField gettContra2() {
        return tContra2;
    }
    
    
}
