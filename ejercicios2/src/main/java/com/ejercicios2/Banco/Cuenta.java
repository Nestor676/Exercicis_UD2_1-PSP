package com.ejercicios2.Banco;

import java.util.concurrent.locks.ReentrantLock;

public class Cuenta {
    private int id;
    private int saldo = (int) (Math.random() * 2000);
    private final ReentrantLock lock = new ReentrantLock();
    
    public ReentrantLock getLock(){
        return lock;
    }
}
