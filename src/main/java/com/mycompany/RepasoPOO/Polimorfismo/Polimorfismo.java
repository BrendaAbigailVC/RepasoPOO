/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.RepasoPOO.Polimorfismo;

/**
 *
 * @author brendajazmin
 */
public class Polimorfismo {
    
    public static void main(String[] args){
        
        Persona vector[] = new Persona[3];
        vector[0] = new Persona();
        vector[1]= new Empleado();
        vector[2] = new Consultor();
        vector[3] = new Jefe();
        Persona per = new Persona();
        Consultor con = new Consultor();
        
        
        per= con;
        
        
        
    }
}
