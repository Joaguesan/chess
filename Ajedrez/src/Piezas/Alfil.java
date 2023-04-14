/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Piezas;

import ajedrez.Casilla;
import ajedrez.Tablero;

/**
 *
 * @author ausias
 */
public class Alfil extends Pieza {
    public Alfil(boolean blanca) {
        super(blanca);
    }

    @Override
    public boolean Mover(Tablero t, Casilla inicio, Casilla fin) {
        boolean posible=true;
        if (this.isBlanca() == fin.getPieza().isBlanca()) {
            posible= false;
        }
        for (int lineaY = inicio.getY(), lineaX = inicio.getX(); lineaY < fin.getY() || lineaX < fin.getX(); lineaY++,lineaX++) {
            if (t.PiezaTablero(lineaX, lineaY)) {
                posible= false;
            }
        }
        for (int lineaY = inicio.getY(), lineaX = inicio.getX(); lineaY > fin.getY() || lineaX > fin.getX(); lineaY++,lineaX++) {
            if (t.PiezaTablero(lineaX, lineaY)) {
                posible= false;
            }
        }
        return posible;
    }
    
}
