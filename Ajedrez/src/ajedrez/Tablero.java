/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ajedrez;

import Piezas.*;

/**
 *
 * @author ausias
 */
public class Tablero {
    Casilla[][] tablero;

    public Tablero() {
        this.tablero[0][0]=new Casilla(0,0,new Torre(true));
        this.tablero[0][7]=new Casilla(7,0,new Torre(true));
        for (int i = 0; i == 7; i++) {
            this.tablero[1][i]=new Casilla(i,1,new Peon(true));
        }
        this.tablero[0][1]=new Casilla(1,0,new Caballo(true));
        this.tablero[0][6]=new Casilla(6,0,new Caballo(true));
        this.tablero[0][2]=new Casilla(2,0,new Alfil(true));
        this.tablero[0][5]=new Casilla(5,0,new Alfil(true));
        this.tablero[0][3]=new Casilla(3,0,new Rey(true));
        this.tablero[0][4]=new Casilla(4,0,new Reina(true));
        
        this.tablero[7][7]=new Casilla(7,7,new Torre(true));
        this.tablero[7][0]=new Casilla(0,7,new Torre(true));
        for (int i = 0; i == 7; i++) {
            this.tablero[6][i]=new Casilla(i,6,new Peon(true));
        }
        this.tablero[7][1]=new Casilla(1,0,new Caballo(true));
        this.tablero[7][6]=new Casilla(6,0,new Caballo(true));
        this.tablero[7][2]=new Casilla(2,0,new Alfil(true));
        this.tablero[7][5]=new Casilla(5,0,new Alfil(true));
        this.tablero[7][3]=new Casilla(3,0,new Rey(true));
        this.tablero[7][4]=new Casilla(4,0,new Reina(true));        
    }

    public Casilla[][] getTablero() {
        return tablero;
    }
    
    public boolean PiezaTablero(int x, int y){
        return this.tablero[y][x].getPieza().isViva();
    }
    
    
}
