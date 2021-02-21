
package app.Componentes.Compra;

import app.Componentes.Cursos.CursosComponent;
import app.Controlador;
import app.VistaPrincipal.AnuncioComponent;
import app.VistaPrincipal.VistaPrincipalComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeisson
 */
public class CompraComponent implements ActionListener{
    
    private CompraTemplate compraTemplate;
    private CursosComponent cursosComponent;
    private Controlador control;
    private AnuncioComponent anuncio;
    private int resCompra=0;
    
    public CompraComponent(CursosComponent cursosComponent, Controlador controlador){
    
        
        this.compraTemplate=new CompraTemplate(this);
        this.cursosComponent=cursosComponent;
        this.control=controlador;
        
        
    }
    
    public CompraTemplate getCompraTemplate() {
        return compraTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==compraTemplate.getbVolver()){
            this.compraTemplate.setVisible(false);
        }
        
        if(e.getSource()==compraTemplate.getbComprar()){
            
            
                resCompra=control.validarCompra(cursosComponent.getCursosTemplate().getlNombre().getText(), 
                        Integer.parseInt(compraTemplate.gettCuenta().getText()));
                if(resCompra==0){
                    
                    if(anuncio==null){
                        anuncio=new AnuncioComponent();
                    }else{
                        anuncio.getAnuncioTemplate().setVisible(true);
                    }
                    anuncio.getAnuncioTemplate().getlMensaje().setText("<html><div align='justify'>"+"CURSO COMPRADO CON EXITO"+"</div></html>");
                    
                    
                    this.compraTemplate.setVisible(false);
                }
                if(resCompra==1){
                    compraTemplate.getlMensaje().setText("CUENTA INVALIDA");
                }
                if(resCompra==2){
                    compraTemplate.getlMensaje().setText("YA CUENTA CON ESTE CURSO");
                }
                if(resCompra==3){
                    compraTemplate.getlMensaje().setText("SALDO INSUFICIENTE");
                }
        
    }
    
}}
