package edu.kinal.Fundamentos.models;



public class Tarea {
        private int numero;
        private String descripcion;


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion.toUpperCase();
    }

    public void setDescripcion(String descripcion) {
        if (descripcion.length() <= 5) {
            System.out.println("error dato invalido");
        } else {
            this.descripcion = descripcion;
        }

    }


}
