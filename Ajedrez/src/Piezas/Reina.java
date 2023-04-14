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
public class Reina extends Pieza {

    public Reina(boolean blanca) {
        super(blanca);
    }
    @Override
    public boolean Mover(Tablero t, Casilla inicio, Casilla fin){
        boolean posible = true;
        if (this.isBlanca() == fin.getPieza().isBlanca()) {
            return true;
        }
        if(inicio.getX()==fin.getX()){
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
        }else if(inicio.getY()==fin.getY()){
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
