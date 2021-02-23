
package app.Componentes.QuienesSomos;

import javax.swing.ImageIcon;

/**
 *
 * @author Jeisson
 */
public class TarjetaComponent {
    
    private TarjetaTemplate tarjetaTemplate;
    
    public TarjetaComponent(ImageIcon iImage){
        tarjetaTemplate = new TarjetaTemplate(this,iImage);
    }
    
    public TarjetaTemplate getTarjetaTemplate(){
        return tarjetaTemplate;
    }
    
}
