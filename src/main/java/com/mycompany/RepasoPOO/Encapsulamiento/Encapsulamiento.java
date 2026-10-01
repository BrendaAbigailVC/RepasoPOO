/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.RepasoPOO.Encapsulamiento;

/**
 *
 * @author brendajazmin
 */
public class Encapsulamiento {
    
    public static void main(String[] args){
        Alumno alum = new Alumno();
        Alumno alum2 = new Alumno(15, "Alan", "Perez");
        
        System.out.println("id " + alum2.getId());
        System.out.println("nombre " + alum2.getNombre());
        System.out.println("id " + alum2.getApellido());
        
        
        
    }
    
}
