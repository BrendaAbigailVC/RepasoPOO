package com.mycompany.RepasoPOO.VideojuegoPokemon;

public class Bulbasaur extends Pokemon implements IPlanta {

    public Bulbasaur() {
    }
    

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Bulbasaur y este es mi ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Bulbasaur y este es mi ataque Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Bulbasaur y este es mi ataque Mordisco");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Soy Bulbasaur y este es mi ataque Paralizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Soy Bulbasaur y este es mi ataque Drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Soy Bulbasaur y este es mi ataque Hoja Afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Soy Bulbasaur y este es mi ataque Látigo Cepa");
    }
}
