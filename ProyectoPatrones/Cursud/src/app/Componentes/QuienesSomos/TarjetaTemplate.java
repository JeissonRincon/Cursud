
package app.Componentes.QuienesSomos;

import app.ServiciosGraficos.ObjetosGraficosService;
import app.ServiciosGraficos.RecursosService;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jeisson
 */
public class TarjetaTemplate extends JPanel{
 
    private TarjetaComponent tarjetaComponent;
    private ObjetosGraficosService sObjGraficos;
    private RecursosService sRecursos;
    
    private JLabel lImagen;
    
    private ImageIcon iAux;
    
    public TarjetaTemplate(TarjetaComponent tarjetaComponent, ImageIcon iImage){
        
        this.tarjetaComponent=tarjetaComponent;
        this.tarjetaComponent.getClass();
        
        sObjGraficos=ObjetosGraficosService.getService();
        sRecursos=RecursosService.getService();
        
        iAux = new ImageIcon(
            iImage.getImage().getScaledInstance(120, 120, Image.SCALE_AREA_AVERAGING)
        );
        
        lImagen=sObjGraficos.construirJLabel(null, 15, 15, 90, 90, iAux,
                null, null, null, "c");
        this.add(lImagen);
        
        this.setSize(120, 120);
        this.setBackground(null);
        this.setLayout(null);
        this.setVisible(true);
    }
    
    
}
