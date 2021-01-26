package br.net.benfatto.ctt.aula05.heranca;

public class Pato extends Animal{

    private AnimalNadador nadador;
    private AnimalVoador voador;
    private AnimalAndador andador;

    public AnimalNadador getNadador() {
        return nadador;
    }

    public void setNadador(AnimalNadador nadador) {
        this.nadador = nadador;
    }

    public AnimalVoador getVoador() {
        return voador;
    }

    public void setVoador(AnimalVoador voador) {
        this.voador = voador;
    }

    public AnimalAndador getAndador() {
        return andador;
    }

    public void setAndador(AnimalAndador andador) {
        this.andador = andador;
    }


}
