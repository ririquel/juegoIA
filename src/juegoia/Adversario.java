
package juegoia;

//import static juegoia.Constantes.NUMERO_CELDAS_ANCHO;
//import static juegoia.Constantes.NUMERO_CELDAS_LARGO;

public class Adversario implements Constantes{
    
    public int posicionX;
    public int posicionY;
    public Escenario escenario;
    
    public Adversario(Escenario escenario, int xi, int yi) {
        posicionX=xi;
        posicionY=yi;
        this.escenario=escenario;
    }
    
    public void moverArriba(){
        if (posicionY > 0 ) {
            if ( escenario.celdas[posicionX][posicionY-1].tipo != 'O' ) {  

//                switch(escenario.celdas[posicionX][posicionY].tipo){
//                    case 'V':energia-=1; break;
//                    case 'R':energia+=10; break;
//                    case 'A':energia-=5; break;
//                }
    
                escenario.celdas[posicionX][posicionY].tipo='V';
                posicionY=posicionY-1;
                escenario.celdas[posicionX][posicionY].tipo='J';
            }
        }
    }
    
    public void moverAbajo(){
        if (posicionY+1 < NUMERO_CELDAS_LARGO ) {
            if ( escenario.celdas[posicionX][posicionY+1].tipo != 'O' ) {
                
//                switch(escenario.celdas[posicionX][posicionY].tipo){
//                    case 'V':energia-=1; break;
//                    case 'R':energia+=10; break;
//                    case 'A':energia-=5; break;
//                }                

                escenario.celdas[posicionX][posicionY].tipo='V';
                posicionY=posicionY+1;
                escenario.celdas[posicionX][posicionY].tipo='J'; 
            }
        }
    }
    
    public void moverIzquierda(){
        if (posicionX > 0 ) {
            if ( escenario.celdas[posicionX-1][posicionY].tipo != 'O' ) {  

//                switch(escenario.celdas[posicionX][posicionY].tipo){
//                    case 'V':energia-=1; break;
//                    case 'R':energia+=10; break;
//                    case 'A':energia-=5; break;
//                }
                
                escenario.celdas[posicionX][posicionY].tipo='V';
                posicionX=posicionX-1;
                escenario.celdas[posicionX][posicionY].tipo='J'; 
            }
        }
    }
    
    public void moverDerecha(){
        if (posicionX+1 < NUMERO_CELDAS_ANCHO  ) {
            if ( escenario.celdas[posicionX+1][posicionY].tipo != 'O' ) {   

//                switch(escenario.celdas[posicionX][posicionY].tipo){
//                    case 'V':energia-=1; break;
//                    case 'R':energia+=10; break;
//                    case 'A':energia-=5; break;
//                }
                
                escenario.celdas[posicionX][posicionY].tipo='V';
                posicionX=posicionX+1;
                escenario.celdas[posicionX][posicionY].tipo='J'; 
            }
        }
    }          
}