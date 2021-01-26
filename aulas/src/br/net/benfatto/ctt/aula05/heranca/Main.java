package br.net.benfatto.ctt.aula05.heranca;

public class Main {

    public static void main(String[] args) {

        Gato g = new Gato();
        AnimalAndador a = new AnimalAndador();
        a.andar();
        g.setNome("Mingau");
        System.out.println(g.getNome());
        g.miar();
        g.comer();
        g.dormir();
        g.setAndador(a);
        g.getAndador().andar();

    }
}
