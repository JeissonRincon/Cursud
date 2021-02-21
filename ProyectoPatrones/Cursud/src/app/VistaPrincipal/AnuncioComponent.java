/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.VistaPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jeisson
 */
public class AnuncioComponent implements ActionListener{
    
    private AnuncioTemplate anuncioTemplate;
    
    public AnuncioComponent(){
        anuncioTemplate = new AnuncioTemplate(this);
    }

    public AnuncioTemplate getAnuncioTemplate() {
        return anuncioTemplate;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==anuncioTemplate.getbOk()){
            this.anuncioTemplate.setVisible(false);
        }
    }
    
}
