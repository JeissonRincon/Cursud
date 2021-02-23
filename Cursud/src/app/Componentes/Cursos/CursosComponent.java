
package app.Componentes.Cursos;

import app.Componentes.Compra.CompraComponent;
import app.Controlador;
import app.VistaPrincipal.VistaPrincipalComponent;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

/**
 *
 * @author Jeisson
 */
public class CursosComponent implements ActionListener{
    
    private CursosTemplate cursosTemplate;
    private CompraComponent compraComponent;
    private VistaPrincipalComponent vistaPrincipalComponent;
    private Controlador controlador;
    
    public CursosComponent(VistaPrincipalComponent vistaPrincipalComponent, int y, String nombre, String descripcion, int precio, ImageIcon dibujo,Controlador controlador){
        
        cursosTemplate = new CursosTemplate(this,y*100,nombre,descripcion,precio,dibujo);
        this.vistaPrincipalComponent=vistaPrincipalComponent;
        this.controlador=controlador;
    
    }
    
    public CursosTemplate getCursosTemplate(){
        return cursosTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==cursosTemplate.getbComprar()){
            
            if(vistaPrincipalComponent.getVistaPrincipalTemplate().getlUsuario().getText().length()==0){
                
            }else{
            
            if(compraComponent==null){
                compraComponent=new CompraComponent(this,controlador);
            }else{
                compraComponent.getCompraTemplate().setVisible(true);
            }}
            
        };
        
    }
    
}
