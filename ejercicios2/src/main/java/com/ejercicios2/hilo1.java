package com.ejercicios2;

public class hilo1 extends Thread{

    public hilo1(){
    }
    
    @Override 
    public void run(){
        while (true) {
            try {
                Thread.sleep(500);
                while (true) {
                    System.out.println("Tic");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
