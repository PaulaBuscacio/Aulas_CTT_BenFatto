package br.net.benfatto.ctt.aula05.heranca;

public class Peixe extends Animal{

     private AnimalNadador nadador;

    public AnimalNadador getNadador() {
        return nadador;
    }

    public void setNadador(AnimalNadador nadador) {
        this.nadador = nadador;
    }
}
