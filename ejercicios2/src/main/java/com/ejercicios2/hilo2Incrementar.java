package com.ejercicios2;

public class hilo2Incrementar implements Runnable{
    public hilo2Incrementar(){

    }

    @Override 
    public void run(){
        for(int i = 0; i < 100000; i++){
            indec(true);
        }
    }
}