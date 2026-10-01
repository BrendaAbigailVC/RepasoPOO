package com.mycompany.RepasoPOO.VideojuegoPokemon;


public abstract class Pokemon {
    
    protected int pnum_pokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;
    protected String tipo;
    
    
    protected abstract void atacarPlacaje();
    
    protected abstract void atacarAraniazo();
    
    protected abstract void atacarMordisco();
    
}
