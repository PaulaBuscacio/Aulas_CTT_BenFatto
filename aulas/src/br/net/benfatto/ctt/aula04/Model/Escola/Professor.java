package br.net.benfatto.ctt.aula04.Model.Escola;


public class Professor extends Membros {

    private int RP;

    public int getRP() {
        return RP;
    }

    public void setRP(int RP) {
        this.RP = RP;
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



