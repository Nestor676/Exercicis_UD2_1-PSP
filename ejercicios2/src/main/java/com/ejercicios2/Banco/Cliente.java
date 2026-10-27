package com.ejercicios2.Banco;

public class Cliente implements Runnable{
    public int num = 0;
    private Cuenta cuenta;

    public Cliente(Cuenta cuenta){
        this.cuenta = cuenta;
    }

    @Override 
    public void run(){
        
    }
}
