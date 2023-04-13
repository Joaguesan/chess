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
public abstract class Pieza {
    private boolean Blanca;
    private boolean viva=true;

    public Pieza(boolean color) {
        this.Blanca = color;
    }

    public boolean isBlanca() {
        return Blanca;
    }

    public void setBlanca(boolean Blanca) {
        this.Blanca = Blanca;
    }

    public boolean isViva() {
        return viva;
    }

    public void setViva(boolean viva) {
        this.viva = viva;
    }
    public abstract boolean Mover(Tablero t, Casilla inicio, Casilla fin);
    
}
