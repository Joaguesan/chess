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

    public Torre(boolean color) {
        super(color);
    }

    @Override
    public boolean Mover(Tablero t, Casilla inicio, Casilla fin) {
        if (this.isBlanca() == fin.getPieza().isBlanca()) {
            return false;
        }
        for (int lineaX = inicio.getX(); lineaX <= fin.getX(); lineaX++) {
            if () {
                return false;
            }
        }

    }
}
