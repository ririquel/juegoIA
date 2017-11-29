package juegoia;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.Timer;

public class Lienzo extends Canvas implements Constantes{
    
    public Escenario escenario;
   
    public Lienzo() {
        escenario=new Escenario(this);
        
        //escuchador de eventos de teclado
        addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                escenario.teclaMovimientoPulsada(evt);
                repaint();
            }
        });
    }
    
    @Override
    public void paint(Graphics g) {
        escenario.paintComponent(g); 
    }
  
}
