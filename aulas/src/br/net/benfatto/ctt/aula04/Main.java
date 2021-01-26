package br.net.benfatto.ctt.aula04;

import br.net.benfatto.ctt.aula04.Model.Escola.Aluno;
import br.net.benfatto.ctt.aula04.Model.Escola.Professor;
import br.net.benfatto.ctt.aula04.Model.Estacionamento.Carro;
import br.net.benfatto.ctt.aula04.Model.Estacionamento.Cliente;

public class Main {

    public static void main(String[] args) {
//        Aluno a = new Aluno();
//        a.setNome("Paula");
//        a.setEmail("aaa@aaa.br");
//        a.setRA(123454);
//
//        System.out.println("Nome: " + a.getNome());
//        System.out.println("Email: " + a.getEmail());
//        System.out.println("RA: " + a.getRA());
//
//        System.out.println();
//
//        Professor p = new Professor();
//        p.setNome("Luxemburgo");
//        p.setEmail("aaa@bbbb.br");
//        p.setRP(14);
//
//        System.out.println("Nome: " + p.getNome());
//        System.out.println("Email: " + p.getEmail());
//        System.out.println("RA: " + p.getRP());

        Cliente c = new Cliente();
        c.setNome("Paula");
        c.setTelefone("9999-99999");
        Carro carro = new Carro();
        carro.setAno(2021);
        carro.setCor("Vermelho");
        carro.setModelo("Ferrari");
        carro.setCliente(c);

        System.out.println(carro.getModelo());
        System.out.println(carro.getCliente().getNome());

    }
}
