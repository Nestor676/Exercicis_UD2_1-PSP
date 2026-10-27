package com.ejercicios2.Run;

public class hilo2 extends Thread{

    public hilo2(){
    }
    
    @Override 
    public void run(){
        while (true) {
            System.out.println("Tac");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
