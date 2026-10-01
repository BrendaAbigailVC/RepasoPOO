package com.mycompany.RepasoPOO.VideojuegoPokemon;

public class Squirtle extends Pokemon implements IAgua {

    public Squirtle() {
    }

    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Squirtle y este es mi ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Squirtle y este es mi ataque Arañazo");    
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Squirtle y este es mi ataque Mordisco");    
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Soy Squirtle y este es mi ataque Hidrobomba");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Soy Squirtle y este es mi ataque Pistola Agua");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Soy Squirtle y este es mi ataque Burbuja");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Soy Squirtle y este es mi ataque Hidropulso");
    }
}
