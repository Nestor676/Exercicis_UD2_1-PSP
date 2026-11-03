package com.ejercicios2;

import java.util.ArrayList;

import com.ejercicios2.Buffer.Buffer;
import com.ejercicios2.Buffer.Consumidor;
import com.ejercicios2.Buffer.Productor;
import com.ejercicios2.Filosofos.cubierto;
import com.ejercicios2.Filosofos.filosofo;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        /* Thread primer = new hilo1();
        Thread segon = new hilo2();

        primer.start();
        segon.start();

        System.out.println("Final Fil Principal");

        hiloRunable h1 = new hiloRunable();
        Thread th1 = new Thread(h1);
        th1.start();

        hilo2Runable h2 = new hilo2Runable();
        Thread th2 = new Thread(h2);
        th2.start();

        Contador contador = new Contador();

        hiloIncrementar h1 = new hiloIncrementar(contador);
        Thread th1 = new Thread(h1);

        hilo2Decrementar h2 = new hilo2Decrementar(contador);
        Thread th2 = new Thread(h2);

        th1.start();
        th2.start();

        th1.join();
        th2.join();

        IO.println(contador.getContador()); 

        int capacidad = 5;
        Buffer buffer = new Buffer(capacidad);

        for(int i = 0; i < 20; i++){
            Productor pr = new Productor(buffer);
            Thread tp = new Thread(pr);

            Consumidor co = new Consumidor(buffer);
            Thread tc = new Thread(co);

            tp.start();
            tc.start(); 
        } */
       
        ArrayList<cubierto> cubiertos = new ArrayList<>();

        cubierto c1 = new cubierto();
        cubierto c2 = new cubierto();
        cubierto c3 = new cubierto();
        cubierto c4 = new cubierto();
        cubierto c5 = new cubierto();
        cubiertos.add(c1);
        cubiertos.add(c2);
        cubiertos.add(c3);
        cubiertos.add(c4);
        cubiertos.add(c5);

        filosofo f1 = new filosofo(1, cubiertos.get(0), cubiertos.get(4));
        filosofo f2 = new filosofo(2, cubiertos.get(1), cubiertos.get(0));
        filosofo f3 = new filosofo(3, cubiertos.get(2), cubiertos.get(1));
        filosofo f4 = new filosofo(4, cubiertos.get(3), cubiertos.get(2));
        filosofo f5 = new filosofo(5, cubiertos.get(4), cubiertos.get(3));

        Thread th1 = new Thread(f1);
        Thread th2 = new Thread(f2);
        Thread th3 = new Thread(f3);
        Thread th4 = new Thread(f4);
        Thread th5 = new Thread(f5);

        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();

        th1.join();
        th2.join();
        th3.join();
        th4.join();
        th5.join();
    }
}