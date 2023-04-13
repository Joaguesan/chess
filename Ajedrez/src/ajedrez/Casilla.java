/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ajedrez;

import Piezas.Pieza;

/**
 *
 * @author ausias
 */
public class Casilla {
    private Pieza pieza;
    private int x;
    private int y;

    public Casilla(int x, int y,Pieza pieza) {
        this.x = x;
        this.y = y;
        this.pieza=pieza;
    }

    public Pieza getPieza() {
        return pieza;
    }

    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}
