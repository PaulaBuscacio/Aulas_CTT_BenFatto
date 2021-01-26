package br.net.benfatto.ctt.aula06.interfaces;


import br.net.benfatto.ctt.aula06.heranca.Animal;
import br.net.benfatto.ctt.aula06.heranca.AnimalAndador;

public class Cachorro extends Animal {

    private IAnimalAndador andador;
    

    public Cachorro(IAnimalAndador andador) {
        this.andador = andador;
    }

    private void latir() {
        System.out.println("Latindo");
    }

    public IAnimalAndador getAndador() {
        return andador;
    }

    public void setAndador(IAnimalAndador andador) {
        this.andador = andador;
    }

    @Override
    public void comer() {
        System.out.println("Cachorro comendo");
    }


}
