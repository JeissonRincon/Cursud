/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ofertas.negocio;


/**
 *
 * @author CARLOS SANTIAGO ROJAS MORENO
 */
public class Curso {
    private String nombre, dirImagen;
    private int oferta;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirImagen() {
        return dirImagen;
    }

    public void setDirImagen(String dirImagen) {
        this.dirImagen = dirImagen;
    }

    public int getOferta() {
        return oferta;
    }

    public void setOferta(int precio) {
        this.oferta = precio;
    }
    
}
