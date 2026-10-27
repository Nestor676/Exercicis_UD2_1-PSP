package com.ejercicios2.Buffer;

public class Consumidor implements Runnable{
    private Buffer _buffer;

    public Consumidor(Buffer _buffer){
        this._buffer = _buffer;
    }

    @Override 
    public void run(){
        _buffer.llegir();
    }
}
