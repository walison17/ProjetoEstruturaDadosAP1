/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifavip.estruturadados.model;

/**
 *
 * @author fabio
 */
public class Test {

    public static void main(String[] args) {

        //Teste de generics
        
        double tempoInicio;
        double tempoFim;
        double tempoDiferenca;

        ListaSequencial lista = new ListaSequencial();

        lista.tamanho = 10000;
        lista.aumentaTamanho = 5000;
        
        
                
        
        tempoInicio = System.currentTimeMillis();
        System.out.println("\nCARREGANDO (inicio) -> " + tempoInicio);
        
 
        for (int i = 0; i < 100000; i++) {
            Pessoa aluno = new Pessoa("Aluno "+i,i);
            lista.adiciona(aluno);
        }
        
        
        tempoFim = System.currentTimeMillis();
        tempoDiferenca = (tempoFim - tempoInicio) / 1000;

        System.out.println("CARREGANDO (fim) -> " + tempoFim);
        System.out.println("CARREGANDO (diferenca) > 10000 -> " + tempoDiferenca);
        System.out.println("");
        System.out.println("-------------------------------------------");
        
        
        
        System.out.println(lista.toString());
        System.out.println(lista.tamanhoLista());
        System.out.println(lista.retornaAluno(100));
        lista.remove(100);
        System.out.println(lista.retornaAluno(100));
        Pessoa aluno = new Pessoa("Fábio",18);
        lista.adicionaQualquerPos(10, aluno);
        System.out.println(lista.contemAluno(aluno));
        
        
    }
}
