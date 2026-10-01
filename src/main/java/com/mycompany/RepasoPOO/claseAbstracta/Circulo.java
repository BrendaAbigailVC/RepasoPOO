/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.RepasoPOO.claseAbstracta;

/**
 *
 * @author brendajazmin
 */
public class Circulo extends Figura{
    
    private double radio;

    public Circulo(double radio, double x, double y) {
        super(x, y);
        this.radio = radio;
    }

    public Circulo() {
    }
    
    @Override
    public double calcularArea() {
        double pi = 3.1416;
        double resultado =  pi * radio * radio;
        return resultado;
    }
    
}
