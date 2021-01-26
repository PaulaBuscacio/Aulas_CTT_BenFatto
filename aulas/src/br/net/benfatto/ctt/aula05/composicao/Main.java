package br.net.benfatto.ctt.aula05.composicao;

import br.net.benfatto.ctt.aula05.heranca.Gato;

public class Main {

    public static void main(String[] args) {

        //sistema de pet shop para cachorros

        Raca racaBoxer = new Raca();
        racaBoxer.setTipo("boxer");

        Cachorro caoBidu = new Cachorro();
        caoBidu.setNome("Bidu");
        caoBidu.setDono("Paula");
        caoBidu.setRaca(racaBoxer);

        System.out.println(caoBidu.getNome());
        System.out.println(racaBoxer.getTipo());
        System.out.println(caoBidu.getDono());
        System.out.println(caoBidu.getRaca().getTipo());


    }
}

