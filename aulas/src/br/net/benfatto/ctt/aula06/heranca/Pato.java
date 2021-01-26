package br.net.benfatto.ctt.aula06.heranca;

public class Pato extends Animal {

    private AnimalNadador nadador;
    private AnimalVoador voador;
    private AnimalAndador andador;


    public Pato(AnimalAndador andador) {
        this.andador = andador;
    }

    public Pato(AnimalNadador nadador) {
        this.nadador = nadador;
    }

    public Pato(AnimalVoador voador) {
        this.voador = voador;
    }

    public AnimalNadador getNadador() {
        return nadador;
    }

    public void setNadador(AnimalNadador nadador) {
        this.nadador = nadador;
    }

    public AnimalVoador getVoador() throws Exception {

        if(this.voador == null) {
            throw new Exception("Este pato não pode voar.");
        } else {
            return voador;
        }
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

    @Override
    public void dormir() {
        System.out.println("Pato dormindo");
    }


}
