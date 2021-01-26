package br.net.benfatto.ctt.aula04.Model.Escola;

import br.net.benfatto.ctt.aula04.Model.Escola.Membros;

public class Aluno extends Membros {

    private int RA;

    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getEmail() {
       return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }


}
