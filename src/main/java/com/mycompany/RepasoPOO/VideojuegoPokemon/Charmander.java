package com.mycompany.RepasoPOO.VideojuegoPokemon;

public class Charmander extends Pokemon implements IPlanta {

    public Charmander() {
    }
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Charmander y este es mi ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Charmander y este es mi ataque Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Charmander y este es mi ataque Mordisco");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Soy Charmander y estoy usando Paralizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Soy Charmander y estoy usando Giga Drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Soy Charmander y estoy usando Hoja Afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Soy Charmander y estoy usando Látigo Cepa");
    }
}
