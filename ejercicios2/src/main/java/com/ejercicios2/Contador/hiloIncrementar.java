package com.ejercicios2.Contador;

public class hiloIncrementar implements Runnable{
    private final Contador contador;
    
    public hiloIncrementar(Contador contador){
        this.contador = contador;
    }

    @Override 
    public void run(){
        for(int i = 0; i < 100000; i++){
            contador.inc();
        }
    }
}
