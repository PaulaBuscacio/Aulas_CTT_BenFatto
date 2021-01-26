package br.net.benfatto.ctt.aula06.interfaces;

public abstract class Animal {
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

    public abstract void andar();
}
