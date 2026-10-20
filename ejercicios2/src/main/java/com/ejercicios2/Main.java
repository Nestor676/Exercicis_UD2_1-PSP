package com.ejercicios2;

public class Main {
    public static void main(String[] args) {
        Thread primer = new hilo1();
        Thread segon = new hilo2();

        primer.start();
        segon.start();

        System.out.println("Final Fil Principal");
    }
}