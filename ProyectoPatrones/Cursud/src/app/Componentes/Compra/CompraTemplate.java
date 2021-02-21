package app.Componentes.Compra;

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
public class CompraTemplate extends JFrame{
    
    private RecursosService sRecursos;
    private ObjetosGraficosService sObjetosGraficos;
    
    private CompraComponent compraComponent;
    
    private JLabel lCuenta, lMensaje;
    private JTextField tCuenta;
    private JButton bComprar, bVolver;
    
    public CompraTemplate(CompraComponent compraComponent){
        
        sRecursos = RecursosService.getService();
        sObjetosGraficos = ObjetosGraficosService.getService();
        
        this.compraComponent=compraComponent;
        this.compraComponent.getClass();
        
        
        this.crearLabels();
        this.crearCuadrosTextos();
        this.crearBotones();
        
        this.setSize(300, 200);
        this.setLocationRelativeTo(this);       
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(sRecursos.getColorAmarillento());
        this.setLayout(null);
        this.setVisible(true);
    
    }
    
    public void crearLabels(){
    
        lCuenta=sObjetosGraficos.construirJLabel("CUENTA", 20, 40, 100, 30, null, 
                Color.black, null, sRecursos.getFontLogeo(), "l");
        this.add(lCuenta);
        
        lMensaje=sObjetosGraficos.construirJLabel(null, 20, 80, 200, 30, null,
                Color.red, null, sRecursos.getFontLogeo(), "c");
        this.add(lMensaje);
        
    };
    
    public void crearCuadrosTextos(){
    
        tCuenta = sObjetosGraficos.construirJTextField(null, 140, 40, 100, 30, 
                null, Color.black, null, sRecursos.getFontLogeo(), sRecursos.getBorderInferiorGris(), "c");
        this.add(tCuenta);
        
    };
    
    public void crearBotones(){
        
        bComprar = sObjetosGraficos.construirJButton("COMPRAR", 150, 120, 100, 30,sRecursos.getcMano(), null,
                sRecursos.getFontSubtitulos(), sRecursos.getColorVerdoso(), Color.BLACK, sRecursos.getBorderGris(), "c", true);
        bComprar.addActionListener(compraComponent);
        this.add(bComprar);
        
        bVolver = sObjetosGraficos.construirJButton("VOLVER", 20, 120, 100, 30,sRecursos.getcMano(), null, 
                sRecursos.getFontSubtitulos(), sRecursos.getColorVerdoso(), Color.black, sRecursos.getBorderGris(), "c", true);
        bVolver.addActionListener(compraComponent);
        this.add(bVolver);
    
    };

    public JTextField gettCuenta() {
        return tCuenta;
    }

    public JButton getbComprar() {
        return bComprar;
    }

    public JButton getbVolver() {
        return bVolver;
    }

    public JLabel getlMensaje() {
        return lMensaje;
    }
    
    
    
    
}
