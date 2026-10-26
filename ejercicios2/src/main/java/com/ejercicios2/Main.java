package com.ejercicios2;

public class Main {
    public static void main(String[] args) {
        /* Thread primer = new hilo1();
        Thread segon = new hilo2();

        primer.start();
        segon.start();

        System.out.println("Final Fil Principal"); */

        /* hiloRunable h1 = new hiloRunable();
        Thread th1 = new Thread(h1);
        th1.start();

        hilo2Runable h2 = new hilo2Runable();
        Thread th2 = new Thread(h2);
        th2.start(); */

        int contador = 0;

        hiloIncrementar h1 = new hiloIncrementar();
        Thread th1 = new Thread(h1);

        hilo2Incrementar h2 = new hilo2Incrementar();
        Thread th2 = new Thread(h2);

        th1.start();
        th2.start();

        th1.join();
        th2.join();

        IO.println(contador);

        public synchronized void sincronizar(){
                contador++;
        }
    }
}