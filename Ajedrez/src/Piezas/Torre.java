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
public class Torre extends Pieza {

    public Torre(boolean blanca) {
        super(blanca);
    }

    @Override
    public boolean Mover(Tablero t, Casilla inicio, Casilla fin) {
        boolean posible = true;
        if (this.isBlanca() == fin.getPieza().isBlanca()) {
            posible = false;
        }
        if (inicio.getY() < fin.getY()) {
            for (int lineaY = inicio.getY(); lineaY <= fin.getY(); lineaY++) {
                if (t.PiezaTablero(inicio.getX(), lineaY)) {
                    posible = false;
                }
            }
        }else{
            for (int lineaY = inicio.getY(); lineaY >= fin.getY(); lineaY--) {
                if (t.PiezaTablero(inicio.getX(), lineaY)) {
                    posible = false;
                }
            }
        }
        if (inicio.getX() < fin.getX()) {
            for (int lineaX = inicio.getX(); lineaX <= fin.getX(); lineaX++) {
                if (t.PiezaTablero(lineaX, inicio.getY())) {
                    posible = false;
                }
            }
        }else{
            for (int lineaX = inicio.getX(); lineaX >= fin.getX(); lineaX--) {
                if (t.PiezaTablero(lineaX, inicio.getY())) {
                    posible = false;
                }
            }
        }
        return posible;
    }
}
