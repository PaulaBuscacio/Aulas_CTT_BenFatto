package br.net.benfatto.ctt.aula04.Model.Estacionamento;

public class Carro {

    private String modelo;
    private String cor;
    private String placa;
    private int ano;
    private Cliente cliente;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
