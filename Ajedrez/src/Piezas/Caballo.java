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
public class Caballo extends Pieza {
    
    public Caballo(boolean color) {
        super(color);
    }

    @Override
    public boolean Mover(Tablero t, Casilla inicio, Casilla fin) {
        if(this.isBlanca() == fin.getPieza().isBlanca()){
            return false;
        }
        int x = Math.abs(inicio.getX() - fin.getX());
        int y= Math.abs(inicio.getY() - fin.getY());
        return x * y == 2;        
    }
}
