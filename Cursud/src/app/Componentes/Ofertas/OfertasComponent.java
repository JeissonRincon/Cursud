
package app.Componentes.Ofertas;

import app.Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

/**
 *
 * @author Jeisson
 */
public class OfertasComponent implements ActionListener{
    
    private OfertasTemplate ofertasTemplate;
    private Controlador control;
    
    public OfertasComponent(int y, String nombre, int oferta, ImageIcon dibujo, Controlador controlador){
    
        this.ofertasTemplate=new OfertasTemplate(this,y*70,nombre,oferta,dibujo);
        this.control=controlador;
    }

    public OfertasTemplate getOfertasTemplate() {
        return ofertasTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
        if(e.getSource()==ofertasTemplate.getbIr()){
            control.buscarCurso(ofertasTemplate.getlNombre().getText());
        }
    
    }
    
    
    
}
