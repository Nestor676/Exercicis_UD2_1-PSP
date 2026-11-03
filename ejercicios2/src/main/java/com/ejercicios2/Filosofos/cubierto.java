package com.ejercicios2.Filosofos;

import java.util.concurrent.locks.ReentrantLock;

public class cubierto {
    private ReentrantLock lock = new ReentrantLock();

    public void comer(){
        lock.lock();
    }

    public void terminar(){
        lock.unlock();
    }
}
