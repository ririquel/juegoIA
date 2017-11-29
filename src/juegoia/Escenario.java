package juegoia;

import java.awt.Graphics;
import javafx.util.Pair;
import javax.swing.JComponent;

public class Escenario extends JComponent implements Constantes {
    
    public Celda[][] celdas;
    public Jugador jugador;
    public Adversario adversario, adversario2, adversario3;
    public Lienzo dondeSeDibuja;
    
    public Escenario(Lienzo lienzo) {
        dondeSeDibuja=lienzo;
        celdas=new Celda[NUMERO_CELDAS_ANCHO][NUMERO_CELDAS_LARGO];
        //inicializar el array de celdas
        for(int i=0; i < NUMERO_CELDAS_ANCHO; i++)
            for ( int j=0 ; j <  NUMERO_CELDAS_LARGO ; j++) 
            celdas[i][j]=new Celda(i+(i*PIXEL_CELDA),j+(j*PIXEL_CELDA),'V');
       
            celdas[5][5].esPared();
            celdas[4][4].esPared();
            celdas[3][3].esPared();

            celdas[3][4].esRecompensa();
            celdas[3][5].esRecompensa();
            celdas[3][6].esRecompensa();
            celdas[3][7].esRecompensa();

            jugador=new Jugador(this);
            celdas[0][0].tipo='J';
            //celdas[3][9].esPared();
            //DESTINO

            adversario=new Adversario(this,15,15);
            adversario2=new Adversario(this,10,10);
            adversario3=new Adversario(this,7,7);
            celdas[15][15].tipo='A';
            celdas[10][10].tipo='A';
            celdas[7][7].tipo='A';
        }
    
    @Override
    public void paintComponent(Graphics g){
        for(int i=0; i < NUMERO_CELDAS_ANCHO ; i++) 
            for ( int j=0 ; j < NUMERO_CELDAS_LARGO; j++) 
                celdas[i][j].paintComponent(g);
        }
    
     public Celda darCeldaJugador() {
        Celda jug=null;
        for(int i=0; i < NUMERO_CELDAS_ANCHO ; i++) 
            for ( int j=0 ; j < NUMERO_CELDAS_LARGO; j++) 
              if ( celdas[i][j].tipo=='J' ) {
                   jug=celdas[i][j];
                   break;
               }
        return jug;
     }
}
