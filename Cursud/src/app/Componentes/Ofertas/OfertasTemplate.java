/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.Componentes.Ofertas;

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
public class OfertasTemplate extends JPanel{
    
    private ObjetosGraficosService sObjGraficos;
    private RecursosService sRecursos;
    
    private JLabel lNombre,lImagen, lOferta;
    private JButton bIr;
    
    private ImageIcon iAux, iIr;
    
    private OfertasComponent ofertasComponent;
    
    public OfertasTemplate(OfertasComponent ofertasComponent,int y, String nombre, int oferta, ImageIcon dibujo){
        
        this.ofertasComponent=ofertasComponent;
        this.ofertasComponent.getClass();
        
        sObjGraficos=ObjetosGraficosService.getService();
        sRecursos=RecursosService.getService();
        
        iAux = new ImageIcon(
            dibujo.getImage().getScaledInstance(60, 60, Image.SCALE_AREA_AVERAGING)
        );
        
        lImagen=sObjGraficos.construirJLabel(null, 5, 5, 60, 60, iAux, 
                null, null, null, "c");
        this.add(lImagen);
        
        lNombre = sObjGraficos.construirJLabel(nombre, 80, 5, 100, 30, null, 
                null, null, sRecursos.getFontDescripcion(), "c");
        this.add(lNombre);
        
        lOferta = sObjGraficos.construirJLabel(oferta+" %", 80, 40, 50, 20, null, 
                Color.black, sRecursos.getColorVerdoso(), sRecursos.getFontDescripcion(), "c");
        this.add(lOferta);
        
        iIr = new ImageIcon("recursos/ofertas.png");
        
        iAux = new ImageIcon(
            iIr.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        );
        
        bIr = sObjGraficos.construirJButton(null, 140, 40, 20, 20,sRecursos.getcMano(), 
                iAux, null, sRecursos.getColorGris(), null, sRecursos.getBorderGris(), "c", true);
        this.add(bIr);
    
        this.setBounds(0, y, 195, 70);
        this.setBackground(null);
        this.setBorder(sRecursos.getBorderInferiorGris());
        this.setLayout(null);
        this.setVisible(true);
        
    }

    public JButton getbIr() {
        return bIr;
    }

    public JLabel getlNombre() {
        return lNombre;
    }
    
    
}
