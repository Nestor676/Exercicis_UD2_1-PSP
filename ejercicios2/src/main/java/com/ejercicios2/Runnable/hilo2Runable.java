package com.ejercicios2.Runnable;

public class hilo2Runable implements Runnable{
    public hilo2Runable(){

    }

    @Override 
    public void run(){
        while (true) {
            try {
                System.out.println("Tac");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
