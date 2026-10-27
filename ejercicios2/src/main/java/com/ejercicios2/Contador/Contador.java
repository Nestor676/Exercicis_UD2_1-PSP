package com.ejercicios2.Contador;

public class Contador {
    private int contador = 0;

    public synchronized void inc(){
        contador++;
    }

    public synchronized void dec(){
        contador--;
    }

    public int getContador(){
        return contador;
    }
}
