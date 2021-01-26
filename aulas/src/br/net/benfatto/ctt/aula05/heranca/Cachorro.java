package br.net.benfatto.ctt.aula05.heranca;


public class Cachorro extends Animal{

    private AnimalAndador andador;

    private void latir() {
        System.out.println("Latindo");
    }

    public AnimalAndador getAndador() {
        return andador;
    }

    public void setAndador(AnimalAndador andador) {
        this.andador = andador;
    }


}
