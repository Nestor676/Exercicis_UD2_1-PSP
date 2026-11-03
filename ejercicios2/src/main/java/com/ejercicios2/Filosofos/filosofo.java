package com.ejercicios2.Filosofos;

public class filosofo implements Runnable {
    private int id;
    private cubierto cubiertoDerecho;
    private  cubierto cubiertoIzquierdo;

    public filosofo(int id, cubierto cubiertoDerecho, cubierto cubiertoIzquierdo){
        this.id = id;
        this.cubiertoDerecho = cubiertoDerecho;
        this.cubiertoIzquierdo = cubiertoIzquierdo;
    }

    @Override 
    public void run(){
        try{
            cubiertoDerecho.comer();
            cubiertoIzquierdo.comer();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            IO.println("Filosofo:  " + id + " ha comido");
        }finally{
            cubiertoDerecho.terminar();
            cubiertoIzquierdo.terminar();
        }
    }
}
