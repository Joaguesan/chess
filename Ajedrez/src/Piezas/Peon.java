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
public class Peon extends Pieza {

    public Peon(boolean blanca) {
        super(blanca);
    }

    @Override
    public boolean Mover(Tablero t, Casilla inicio, Casilla fin) {
        if(this.isBlanca() == fin.getPieza().isBlanca()){
            return false;
        }
        
        
    }
    
}
