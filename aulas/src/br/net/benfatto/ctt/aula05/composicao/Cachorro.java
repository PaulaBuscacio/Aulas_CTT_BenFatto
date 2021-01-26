package br.net.benfatto.ctt.aula05.composicao;

public class Cachorro {

    private String nome;
    private Raca raca;
    private String dataNascimento;
    private String dono;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
}
