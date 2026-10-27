package com.ejercicios2.Buffer;

import java.util.ArrayList;
import java.util.List;

public class Buffer {
    public List<Integer> lista;
    private int capacidad;

    public Buffer(){}

    public Buffer(int capacidad){
        this.capacidad = capacidad;
        lista = new ArrayList<>();
    }

    public synchronized void afegir(int num) throws InterruptedException{
        while(lista.size() >= capacidad){
            try{
                wait();
            } catch(InterruptedException e){
                IO.println(e.getMessage());
            }
        }

        lista.add(num);
        IO.println("Numero añadido");
        IO.println(lista);
        notifyAll();
    }

    public synchronized void llegir(){
        while(lista.isEmpty()) {
            try{
                wait();
            }catch(InterruptedException e){
                IO.println(e.getMessage());
            }
        }

        IO.println("Numero leido: " + lista.getLast());
        IO.println(lista);
        notifyAll();
    }
}
