package br.net.benfatto.ctt.aula06.interfaces;

public class AnimalAndadorCachorroTresCasas extends Animal implements IAnimalAndador, IAnimal{

    @Override
    public void andar() {
        System.out.println("Cachorro andando com três casas");
    }

    @Override
    public void comer() {
        System.out.println("Cachorro comendo após andar três casas");
    }
}
