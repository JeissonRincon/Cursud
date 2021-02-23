package app.Componentes.Cursos;

import app.ServiciosGraficos.ObjetosGraficosService;
import app.ServiciosGraficos.RecursosService;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jeisson
 */
public class CursosTemplate extends JPanel{
    
    private CursosComponent cursosComponent;
    private ObjetosGraficosService sObjGraficos;
    private RecursosService sRecursos;
    
    private JLabel lDescripcion,lNombre,lImagen,lPrecio;
    private JButton bComprar;
    
    private ImageIcon iAux, iCarrito;
    
    
    
    public CursosTemplate(CursosComponent cursosComponent, int y, String nombre, String descripcion,int precio, ImageIcon dibujo){
        
        this.cursosComponent=cursosComponent;
        this.cursosComponent.getClass();
        
        sObjGraficos=ObjetosGraficosService.getService();
        sRecursos=RecursosService.getService();
        
        iCarrito = new ImageIcon("recursos/logoCompras.png");
        
        iAux = new ImageIcon(
            dibujo.getImage().getScaledInstance(90, 90, Image.SCALE_AREA_AVERAGING)
        );
        
        lImagen=sObjGraficos.construirJLabel(null, 5, 5, 90, 90, iAux, null,
                null, null, "c");
        this.add(lImagen);
        
        lNombre=sObjGraficos.construirJLabel(nombre, 100, 5, 200, 20, null, Color.black, 
                null, sRecursos.getFontLogeo(), "l");
        this.add(lNombre);
        
        lDescripcion = sObjGraficos.construirJLabel("<html><div align='justify'>"+descripcion+"</div></html>", 100, 40, 200, 50, null, Color.black, 
                null, sRecursos.getFontLogeo(), "l");
        this.add(lDescripcion);
        
        iAux = new ImageIcon(
            iCarrito.getImage().getScaledInstance(40, 30, Image.SCALE_AREA_AVERAGING)
        );
        
        bComprar = sObjGraficos.construirJButton(null, 340, 50, 40, 30,sRecursos.getcMano(), iAux, null, sRecursos.getColorVerdoso(), 
                null, sRecursos.getBorderGris(), "c", true);
        bComprar.addActionListener(cursosComponent);
        this.add(bComprar);
        
        lPrecio = sObjGraficos.construirJLabel("$ "+precio, 330, 5, 50, 30, null,
                Color.black, sRecursos.getColorVerdoso(), sRecursos.getFontDescripcion(),"c");
        this.add(lPrecio);
        
    
        this.setBounds(0, y, 405, 100);
        this.setBackground(null);
        this.setBorder(sRecursos.getBorderInferiorGris());
        this.setLayout(null);
        this.setVisible(true);
    }

    public JButton getbComprar() {
        return bComprar;
    }

    public JLabel getlNombre() {
        return lNombre;
    }
    
    
    
    
    
}
