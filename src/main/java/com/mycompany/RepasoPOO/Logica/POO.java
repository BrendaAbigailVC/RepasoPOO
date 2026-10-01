/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.RepasoPOO.Logica;

/**
 *
 * @author brendajazmin
 */
public class POO {

    public static void main(String[] args) {
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(35, "Brenda", "Valdes");
        
        
        System.out.println("La id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre es " + alu2.getNombre());
        System.out.println("El apellido es " +alu2.getApellido());
        
        System.out.println("-----------------");
        alu1.setId(8);
        alu1.setNombre("Juan");
        alu1.setApellido("Lopez");
        System.out.println("La id del alumno 1 es: " + alu1.getId());
        System.out.println("El nombre es " + alu1.getNombre());
        System.out.println("El apellido es " + alu1.getApellido());
        
        System.out.println("-----------------");
        alu2.setId(30);
        System.out.println("La id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre es " + alu2.getNombre());
        System.out.println("El apellido es " +alu2.getApellido());
              
    }
    
    
}
