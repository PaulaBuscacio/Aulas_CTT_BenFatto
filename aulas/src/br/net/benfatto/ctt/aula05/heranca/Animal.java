package br.net.benfatto.ctt.aula05.heranca;

public class Animal {
    private String nome;

     public void comer() {
        System.out.println("Comendo");
    }

    public void dormir() {
        System.out.println("Dormindo");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
