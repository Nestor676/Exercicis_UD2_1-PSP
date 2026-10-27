package com.ejercicios2.Buffer;

import com.ejercicios2.Buffer.Buffer;

public class Productor implements Runnable{
    int num = 0;
    private Buffer buffer;

    public Productor(Buffer buffer){
        this.buffer = buffer;
    }

    @Override 
    public void run(){
        try{
            num = (int) (Math.random() * 100);
            buffer.afegir(num);
        } catch(InterruptedException e){
            IO.println(e.getMessage());
        }
    }
}
