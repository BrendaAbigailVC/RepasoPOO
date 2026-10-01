package com.mycompany.RepasoPOO.VideojuegoPokemon;

public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu() {
    }
    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Pikachu y este es mi ataque Placaje");    
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Pikachu y este es mi ataque Arañazo");    
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Pikachu y este es mi ataque Mordisco");    
    }

    @Override
    public void atacarImpactrueo() {
        System.out.println("Soy Pikachu y este es mi ataque Impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Soy Pikachu y este es mi ataque Puño Trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Soy Pikachu y este es mi ataque Rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Soy Pikachu y este es mi ataque Rayo Carga");
    }
}
