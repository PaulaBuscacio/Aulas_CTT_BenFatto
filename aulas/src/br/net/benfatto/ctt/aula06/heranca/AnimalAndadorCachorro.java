package br.net.benfatto.ctt.aula06.heranca;

import br.net.benfatto.ctt.aula06.interfaces.IAnimalAndador;

public class AnimalAndadorCachorro implements IAnimalAndador {
    public void andar() {
        System.out.println("Cachorro andando");
    }
}
