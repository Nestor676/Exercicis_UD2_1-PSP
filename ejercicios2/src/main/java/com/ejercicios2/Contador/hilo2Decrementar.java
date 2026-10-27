package com.ejercicios2.Contador;

public class hilo2Decrementar implements Runnable{
    private final Contador contador;
    
    public hilo2Decrementar(Contador contador){
        this.contador = contador;
    }

    @Override 
    public void run(){
        for(int i = 0; i < 100000; i++){
            contador.dec();
        }
    }
}