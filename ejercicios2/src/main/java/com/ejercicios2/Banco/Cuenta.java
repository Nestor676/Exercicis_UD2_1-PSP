package com.ejercicios2.Banco;

import java.util.concurrent.locks.ReentrantLock;

public class Cuenta {
    private int saldo = 100;
    private final ReentrantLock lock = new ReentrantLock();
    
}
