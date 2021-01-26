package br.net.benfatto.ctt.aula06.heranca;


public class Cachorro extends Animal {

    private AnimalAndador andador;

    public Cachorro(AnimalAndador andador) {
        this.andador = andador;
    }

    private void latir() {
        System.out.println("Latindo");
    }

    public AnimalAndador getAndador() {
        return andador;
    }

    public void setAndador(AnimalAndador andador) {
        this.andador = andador;
    }

    @Override
    public void comer() {
        System.out.println("Cachorro comendo");
    }


}
