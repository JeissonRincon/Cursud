package app.ServiciosGraficos;

// @author Jeisson

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class RecursosService {
    
    private Color colorAzulMarino, colorNegro, colorAzul,colorGris,colorRojo, colorVerdoso, colorAmarillento;
    private Font fontNombrePagina, fontFLV, fontIniciarSesion,fontSubtitulos,fontBotones,
            fontLetrero,fontDescripcion,fontNameAnime,fontLogeo;
    private Cursor cMano;
    private Border borderInferiorNegro,borderGris,borderInferiorAzul,borderInferiorGris,borderEpi;
    private ImageIcon iCursud, iCurso;
    
    static private RecursosService servicio;
    
    private RecursosService(){
        colorAzulMarino = new Color(40,221,221);
        colorNegro = new Color(21,20,19);
        colorAzul = new Color (44,64,163);
        colorGris = new Color (181,182,190);
        colorRojo = new Color (247,73,94);
        colorVerdoso = new Color (32,184,147);
        colorAmarillento = new Color(228,238,139);
        fontNombrePagina = new Font("Rockwell Extra Bold",Font.PLAIN,30);
        fontFLV = new Font("Rockwell Extra Bold",Font.ITALIC,35);
        fontIniciarSesion = new Font("Georgia",Font.BOLD,14);
        fontSubtitulos = new Font("Georgia",Font.BOLD,12);
        fontLogeo = new Font("Georgia",Font.PLAIN,12);
        fontBotones = new Font("Rockwell Extra Bold",Font.BOLD,15);
        fontLetrero = new Font("Rockwell Extra Bold",Font.PLAIN,12);
        fontDescripcion = new Font("Georgia",Font.PLAIN,10);
        fontNameAnime = new Font("Georgia",Font.BOLD,14);
        iCursud = new ImageIcon("recursos/logoCursud.png");
        iCurso = new ImageIcon("recursos/Cursos/Funciones.png");
        borderInferiorNegro = BorderFactory.createMatteBorder(0, 0, 2, 0, colorNegro);
        borderInferiorAzul = BorderFactory.createMatteBorder(0, 0, 2, 0, colorAzul);
        borderInferiorGris = BorderFactory.createMatteBorder(0, 0, 2, 0, colorGris);
        borderGris = BorderFactory.createBevelBorder(1, Color.DARK_GRAY, Color.LIGHT_GRAY);
        borderEpi = BorderFactory.createMatteBorder(3, 3, 3, 3, colorRojo);
        cMano = new Cursor(Cursor.HAND_CURSOR);
    }

    public Color getColorAzulMarino() {
        return colorAzulMarino;
    }

    public Color getColorNegro() {
        return colorNegro;
    }

    public Color getColorAzul() {
        return colorAzul;
    }

    public Color getColorRojo() {
        return colorRojo;
    }

    public Color getColorVerdoso() {
        return colorVerdoso;
    }

    public Color getColorAmarillento() {
        return colorAmarillento;
    }
    
    
    
    public Border getBorderInferiorAzul() {
        return borderInferiorAzul;
    }
    
    public Font getFontNombrePagina() {
        return fontNombrePagina;
    }

    public Color getColorGris() {
        return colorGris;
    }

    public Border getBorderInferiorGris() {
        return borderInferiorGris;
    }

    public Font getFontLogeo() {
        return fontLogeo;
    }
    
    

    public Font getFontFLV() {
        return fontFLV;
    }

    public Font getFontIniciarSesion() {
        return fontIniciarSesion;
    }

    public Font getFontSubtitulos() {
        return fontSubtitulos;
    }

    public Font getFontBotones() {
        return fontBotones;
    }

    public Font getFontLetrero() {
        return fontLetrero;
    }

    public Font getFontDescripcion() {
        return fontDescripcion;
    }

    public Font getFontNameAnime() {
        return fontNameAnime;
    }
    
    public Cursor getcMano() {
        return cMano;
    }

    public Border getBorderInferiorNegro() {
        return borderInferiorNegro;
    }

    public Border getBorderGris() {
        return borderGris;
    }

    public Border getBorderEpi() {
        return borderEpi;
    }
    
    
    public ImageIcon getiCursud() {
        return iCursud;
    }

    public ImageIcon getiCurso() {
        return iCurso;
    }
    
    

    
     public static RecursosService getService(){
        if(servicio == null){
            servicio = new RecursosService();
        }
        return servicio;
    }
    
}
