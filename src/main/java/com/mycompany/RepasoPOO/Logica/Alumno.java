/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.RepasoPOO.Logica;

/**
 *
 * @author brendajazmin
 */
public class Alumno {
    int id;
    String nombre;
    String apellido;

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Alumno() {}

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    public void mostrarNombre(){
        System.out.println("Hola, soy un alumno y se decir mi nombre");
   
    }
    
    public void saberAprobado(double calificacion)
    {
        if (calificacion >= 6){
            System.out.println("Aprobe la materia");
        }else {
            System.out.println("Uyy no aprobe");
        }
    }
    
}
