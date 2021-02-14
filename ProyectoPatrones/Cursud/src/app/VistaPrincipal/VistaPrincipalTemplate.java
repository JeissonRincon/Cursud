package app.VistaPrincipal;

import app.Componentes.QuienesSomos.TarjetaComponent;
import app.ServiciosGraficos.ObjetosGraficosService;
import app.ServiciosGraficos.RecursosService;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author Jeisson
 */
public class VistaPrincipalTemplate extends JFrame{
    
    private RecursosService sRecursos;
    private ObjetosGraficosService sObjetosGraficos;
    private VistaPrincipalComponent vistaPrincipalComponent;
    
    private ImageIcon iCursud, iCarrito,iAux;
    
    private ImageIcon iJeisson, iUd;
    
    
    private JPanel pSuperior, pBotonesLog, pInfo, pListOfertas;
    private JButton bCarrito, bMisCursos;
    private JLabel lNombre, lQuienSomos;
    private JTextField tBuscador;
    
    
    private JPanel jTarjeta1,jTarjeta2,jTarjeta3;
    
    public VistaPrincipalTemplate(VistaPrincipalComponent vistaPrincipalComponent){
    
        
        sRecursos = RecursosService.getService();
        sObjetosGraficos = ObjetosGraficosService.getService();
        
        this.crearDecoracion();
        this.crearPaneles();
        this.crearBotones();
        this.crearLabels();
        this.crearCuadrosTexto();
        
        this.crearContenidoTarjeta1();
        this.crearContenidoTarjeta3();
        
        this.setSize(615, 660);
        this.setLocationRelativeTo(this);       
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.yellow);
        this.setLayout(null);
        this.setVisible(true);
        
    }
    
    public void crearDecoracion(){
    
        iCursud = new ImageIcon("recursos/logoCursud.png");
        iCarrito = new ImageIcon("recursos/logoCompras.png");
        iJeisson = new ImageIcon("recursos/QuienesSomos/Jeisson.jpeg");
        iUd = new ImageIcon("recursos/QuienesSomos/ud.png");
    
    }
    
    
    public void crearPaneles(){
        
        pSuperior=sObjetosGraficos.construirJPanel(0, 0, 405, 50, Color.LIGHT_GRAY, null);
        this.add(pSuperior);
        
        pBotonesLog=sObjetosGraficos.construirJPanel(405, 0, 195, 50, Color.LIGHT_GRAY, null);
        this.add(pBotonesLog);
        
        pInfo=sObjetosGraficos.construirJPanel(240, 500, 360, 120, Color.red, null);
        this.add(pInfo);
        
        pListOfertas=sObjetosGraficos.construirJPanel(0, 50, 200, 450, Color.blue, null);
        this.add(pListOfertas);
        
        jTarjeta1=sObjetosGraficos.construirJPanel(0, 0, 120, 120, Color.orange, sRecursos.getBorderInferiorGris());
        pInfo.add(jTarjeta1);
        
        jTarjeta3=sObjetosGraficos.construirJPanel(240, 0, 120, 120, Color.orange, sRecursos.getBorderInferiorGris());
        pInfo.add(jTarjeta3);
        
    
    }
    
    public void crearBotones(){
    
        iAux= new ImageIcon(iCarrito.getImage().getScaledInstance(40, 30, Image.SCALE_AREA_AVERAGING));
        
        bCarrito = sObjetosGraficos.construirJButton(null, 360, 10, 40, 30,sRecursos.getcMano(), 
                iAux, null, sRecursos.getColorVerdoso(), Color.BLACK, sRecursos.getBorderGris(), "c", true);
        pSuperior.add(bCarrito);
        
        
        
    }
    
    public void crearLabels(){
        
        iAux= new ImageIcon(iCursud.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING));
        
        lNombre = sObjetosGraficos.construirJLabel("Cursud", 10, 10, 110, 30, 
                iAux, Color.black, null, sRecursos.getFontNameAnime(), "c");
        pSuperior.add(lNombre);
        
        lQuienSomos=sObjetosGraficos.construirJLabel("Conoce Más", 5, 500, 130, 20, 
                null, Color.BLACK, null, sRecursos.getFontNameAnime(), "c");
        this.add(lQuienSomos);
    }
    
    public void crearCuadrosTexto(){
        tBuscador=sObjetosGraficos.construirJTextField("Buscar Cursos", 130, 10, 200, 30, null, 
                Color.BLACK, null, null, sRecursos.getBorderInferiorNegro(), "l");
        pSuperior.add(tBuscador);
    }
    
    public void crearContenidoTarjeta1(){
    
        this.jTarjeta1.add(new TarjetaComponent(iUd).getTarjetaTemplate());
        
    }
    
    public void crearContenidoTarjeta3(){
    
        this.jTarjeta3.add(new TarjetaComponent(iJeisson).getTarjetaTemplate());
        
    }
    
    
    
    public void crearQuienesSomos(){
    
        
    }

    public JPanel getpBotonesLog() {
        return pBotonesLog;
    }
    
    
    
}
