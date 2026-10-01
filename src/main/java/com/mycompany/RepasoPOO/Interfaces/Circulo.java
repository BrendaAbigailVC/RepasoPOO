/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.RepasoPOO.Interfaces;

/**
 *
 * @author brendajazmin
 */
public class Circulo implements Figura, Dibujable, Rotable{
    
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        double pi = 3.1416;
        double resultado =  pi * radio * radio;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Estoy dibujando un circulo");
    }

    @Override
    public void rotar() {
        System.out.println("Estoy rotando un circulo");
    } 
}
