package app.VistaPrincipal;

import app.Componentes.Cursos.CursosComponent;
import app.Componentes.Cursos.CursosTemplate;
import app.Componentes.QuienesSomos.TarjetaComponent;
import app.ServiciosGraficos.ObjetosGraficosService;
import app.ServiciosGraficos.RecursosService;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Jeisson
 */
public class VistaPrincipalTemplate extends JFrame{
    
    private RecursosService sRecursos;
    private ObjetosGraficosService sObjetosGraficos;
    private VistaPrincipalComponent vistaPrincipalComponent;
    
    private ImageIcon iCursud, iBusqueda,iAux;
    
    private ImageIcon iJeisson, iUd, iCurso;
    
    
    private JPanel pSuperior, pBotonesLog, pInfo, pListOfertas;
    private JButton bBuscar, bMisCursos;
    private JLabel lNombre, lQuienSomos, lUsuario,lUd,lJeisson,lSantiago;
    private JTextField tBuscador;
    private JScrollPane sCursos, sOfertas;
    
    private JPanel cursero;
    
    
    
    
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
        this.getContentPane().setBackground(Color.ORANGE);
        this.setLayout(null);
        this.setVisible(true);
        
    }
    
    public void crearDecoracion(){
    
        iCursud = new ImageIcon("recursos/logoCursud.png");
        iBusqueda = new ImageIcon("recursos/logoBusqueda.png");
        iJeisson = new ImageIcon("recursos/QuienesSomos/Jeisson.jpeg");
        iUd = new ImageIcon("recursos/QuienesSomos/ud.png");
        
    
    }
    
    
    public void crearPaneles(){
        
        pSuperior=sObjetosGraficos.construirJPanel(0, 0, 405, 50, Color.LIGHT_GRAY, null);
        this.add(pSuperior);
        
        pBotonesLog=sObjetosGraficos.construirJPanel(405, 0, 195, 50, Color.LIGHT_GRAY, null);
        this.add(pBotonesLog);
        
        pInfo=sObjetosGraficos.construirJPanel(240, 500, 360, 120, sRecursos.getColorAmarillento(), null);
        this.add(pInfo);
        
        pListOfertas=sObjetosGraficos.construirJPanel(0, 50, 195, 10000, null, null);
        
        jTarjeta1=sObjetosGraficos.construirJPanel(0, 0, 120, 120, null, sRecursos.getBorderInferiorGris());
        pInfo.add(jTarjeta1);
        
        jTarjeta3=sObjetosGraficos.construirJPanel(240, 0, 120, 120, null, sRecursos.getBorderInferiorGris());
        pInfo.add(jTarjeta3);
        
        cursero = sObjetosGraficos.construirJPanel(200, 50, 400, 10000, null, null);
        
        sCursos=sObjetosGraficos.construirPanelBarra(cursero, 200, 50, 400, 450, sRecursos.getColorAmarillento(), null);
        this.add(sCursos);
        
        sOfertas=sObjetosGraficos.construirPanelBarra(pListOfertas, 0, 50, 195, 450, sRecursos.getColorAzulMarino(), null);
        this.add(sOfertas);
    
    }
    
    public void crearBotones(){
    
        iAux= new ImageIcon(iBusqueda.getImage().getScaledInstance(40, 30, Image.SCALE_AREA_AVERAGING));
        
        bBuscar = sObjetosGraficos.construirJButton(null, 360, 10, 40, 30,sRecursos.getcMano(), 
                iAux, null, sRecursos.getColorVerdoso(), Color.BLACK, sRecursos.getBorderGris(), "c", true);
        bBuscar.addActionListener(vistaPrincipalComponent);
        pSuperior.add(bBuscar);
            
    }
    
    public void crearLabels(){
        
        iAux= new ImageIcon(iCursud.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING));
        
        lNombre = sObjetosGraficos.construirJLabel("Cursud", 10, 5, 110, 30, 
                iAux, Color.black, null, sRecursos.getFontNameAnime(), "c");
        pSuperior.add(lNombre);
        
        lQuienSomos=sObjetosGraficos.construirJLabel("Equipo:", 5, 500, 130, 20, 
                null, Color.BLACK, null, sRecursos.getFontNameAnime(), "c");
        this.add(lQuienSomos);
        
        lUd = sObjetosGraficos.construirJLabel("Universidad Distrital", 10, 530, 170, 20, 
                null, sRecursos.getColorAzul(), null, sRecursos.getFontLogeo(), "l");
        this.add(lUd);
        
        lSantiago = sObjetosGraficos.construirJLabel("Carlos Santiago Rojas Moreno", 10, 550, 170, 20, 
                null, sRecursos.getColorAzul(), null, sRecursos.getFontLogeo(), "c");
        this.add(lSantiago);
        
        lJeisson = sObjetosGraficos.construirJLabel("Jeisson Steven Rincón Mellizo", 10, 570, 170, 20, 
                null, sRecursos.getColorAzul(), null, sRecursos.getFontLogeo(), "c");
        this.add(lJeisson);
        
        lUsuario=sObjetosGraficos.construirJLabel("", 5, 35, 120, 15, 
                null, Color.black, null, sRecursos.getFontDescripcion(), "c");
        pSuperior.add(lUsuario);
        
        
    }
    
    public void crearCuadrosTexto(){
        tBuscador=sObjetosGraficos.construirJTextField("", 140, 10, 200, 30, null, 
                Color.BLACK, null, null, sRecursos.getBorderInferiorNegro(), "l");
        pSuperior.add(tBuscador);
    }
    
    public void crearContenidoTarjeta1(){
    
        this.jTarjeta1.add(new TarjetaComponent(iUd).getTarjetaTemplate());
        
    }
    
    public void crearContenidoTarjeta3(){
    
        this.jTarjeta3.add(new TarjetaComponent(iJeisson).getTarjetaTemplate());
        
    }

    public JButton getbBuscar() {
        return bBuscar;
    }
        

    public JPanel getpBotonesLog() {
        return pBotonesLog;
    }

    public JLabel getlUsuario() {
        return lUsuario;
    }

    public JPanel getCursero() {
        return cursero;
    }

    public JPanel getpListOfertas() {
        return pListOfertas;
    }

    public RecursosService getsRecursos() {
        return sRecursos;
    }

    public JTextField gettBuscador() {
        return tBuscador;
    }
    
    
    
    
    
}
