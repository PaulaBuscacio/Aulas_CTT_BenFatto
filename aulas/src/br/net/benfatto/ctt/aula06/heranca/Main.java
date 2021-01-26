package br.net.benfatto.ctt.aula06.heranca;

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

        System.out.println("__________________\n");

        Cachorro c = new Cachorro(new AnimalAndador());
        c.comer();
        c.dormir();
        c.getAndador().andar();

        System.out.println("__________________\n");

        Pato p = new Pato(new AnimalAndador());

//        try {
//            p.getVoador().voar;
//        } catch (Exception ex) {
//            System.out.println("Erro ao tentar voar");
//            System.out.println(ex.getMessage());
//        }

    }
}
