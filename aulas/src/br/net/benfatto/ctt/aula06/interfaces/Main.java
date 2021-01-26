package br.net.benfatto.ctt.aula06.interfaces;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro2 = new Cachorro(new AnimalAndadorCachorro());
        cachorro2.getAndador().andar();

        System.out.println("________________________");

        Cachorro cachorro = new Cachorro(new AnimalAndadorCachorroTresCasas());
        cachorro.comer();
        cachorro.dormir();
        cachorro.getAndador().andar();

        System.out.println("________________________");

        Cachorro cachorro1 = new Cachorro(new AnimalAndadorCachorroCincoCasas());
        cachorro1.getAndador().andar();

    }
}
