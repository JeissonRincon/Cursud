/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.Componentes.BotonesLog;

import app.ServiciosGraficos.ObjetosGraficosService;
import app.ServiciosGraficos.RecursosService;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Jeisson
 */
public class ConLoggeoTemplate extends JPanel{
    
    private ObjetosGraficosService sObjG;
    private RecursosService sRecursos;
    
    private ConLoggeoComponent conLoggeoComponent;
    
    private JButton bMisCursos, bDesLoggeo;
    
    public ConLoggeoTemplate(ConLoggeoComponent conLoggeoComponent){
    
        sObjG = ObjetosGraficosService.getService();
        sRecursos = RecursosService.getService();
        
        this.conLoggeoComponent=conLoggeoComponent;
        this.getClass();
        
        this.crearBotones();
        
        this.setSize(185, 50);
        this.setBackground(Color.LIGHT_GRAY);
        this.setLayout(null);
        this.setVisible(true);
    
    }
    
    public void crearBotones(){
    
        bMisCursos = sObjG.construirJButton("Mis Cursos", 10, 10, 85, 30,sRecursos.getcMano()
                , null, sRecursos.getFontIniciarSesion(), sRecursos.getColorVerdoso(), sRecursos.getColorNegro(), sRecursos.getBorderGris(), "c", true);
        this.add(bMisCursos);
        
        bDesLoggeo = sObjG.construirJButton("Log out", 100, 10, 70, 30,sRecursos.getcMano()
                , null, sRecursos.getFontIniciarSesion(), sRecursos.getColorVerdoso(), Color.black, sRecursos.getBorderGris(), "c", true);
        bDesLoggeo.addActionListener(conLoggeoComponent);
        this.add(bDesLoggeo);
    
    }

    public JButton getbMisCursos() {
        return bMisCursos;
    }

    public JButton getbDesLoggeo() {
        return bDesLoggeo;
    }
    
    
}
