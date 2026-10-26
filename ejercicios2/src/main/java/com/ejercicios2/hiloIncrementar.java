package com.ejercicios2;

public class hiloIncrementar implements Runnable{
    public hiloIncrementar(){

    }

    @Override 
    public void run(){
        for(int i = 0; i < 100000; i++){
            indec(true);
        }
    }
}
