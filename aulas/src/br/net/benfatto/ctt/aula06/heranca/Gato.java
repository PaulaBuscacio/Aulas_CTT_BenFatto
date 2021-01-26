package br.net.benfatto.ctt.aula06.heranca;

public class Gato extends Animal {

    private AnimalAndador andador;

    public void miar() {
        System.out.println("Miando");
    }

    public AnimalAndador getAndador() {
        return andador;
    }

    public void setAndador(AnimalAndador andador) {
        this.andador = andador;
    }
}

