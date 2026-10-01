/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.RepasoPOO.VideojuegoPokemon;

/**
 *
 * @author brendajazmin
 */
public class EjercicioIntegrador {
    
    public static void main(String[] args){
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Pikachu pika = new Pikachu();
        
        squirtle.atacarAraniazo();
        squirtle.atacarHidrobomba();
        
        charmander.atacarAraniazo();
        charmander.atacarHojaAfilada();
        
        bulbasaur.atacarAraniazo();
        bulbasaur.atacarDrenaje();
        
        pika.atacarAraniazo();
        pika.atacarPunioTrueno();

    }
   
    
}
