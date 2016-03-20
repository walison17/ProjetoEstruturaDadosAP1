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
public class Teste2 {

    public static void main(String[] args) {
        
        double tempoInicio;
        double tempoFim;
        double tempoDiferenca;

        ListaSequencial lista = new ListaSequencial();
        Aluno aluno = new Aluno("Fábio");

        lista.tamanho = 10000;
        lista.aumentaTamanho = 10000;

        tempoInicio = System.currentTimeMillis();
        System.out.println("\nCARREGANDO (inicio) -> " + tempoInicio);
        lista.povoaLista(1000000);

        tempoFim = System.currentTimeMillis();
        tempoDiferenca = (tempoFim - tempoInicio) / 1000;

        System.out.println("CARREGANDO (fim) -> " + tempoFim);
        System.out.println("CARREGANDO (diferenca) -> " + tempoDiferenca);
        System.out.println("");
        System.out.println("-------------------------------------------");
        
        tempoInicio = System.currentTimeMillis();
        System.out.println("CARREGANDO (inicio) -> " + tempoInicio);
        lista.adicionaQualquerPosicao(750000, aluno);

        tempoFim = System.currentTimeMillis();
        tempoDiferenca = (tempoFim - tempoInicio) / 1000;

        System.out.println("CARREGANDO (fim) -> " + tempoFim);
        System.out.println("CARREGANDO (diferenca) -> " + tempoDiferenca);
        System.out.println("");
        System.out.println("-------------------------------------------");

        tempoInicio = System.currentTimeMillis();
        System.out.println("CARREGANDO (inicio) -> " + tempoInicio);
        lista.retornaAluno(750000);

        tempoFim = System.currentTimeMillis();
        tempoDiferenca = (tempoFim - tempoInicio) / 1000;

        System.out.println("CARREGANDO (fim) -> " + tempoFim);
        System.out.println("CARREGANDO (diferenca) -> " + tempoDiferenca);
        System.out.println("");
        System.out.println("-------------------------------------------");
        
        tempoInicio = System.currentTimeMillis();
        System.out.println("CARREGANDO (inicio) -> " + tempoInicio);
        lista.contemAluno(aluno);

        tempoFim = System.currentTimeMillis();
        tempoDiferenca = (tempoFim - tempoInicio) / 1000;

        System.out.println("CARREGANDO (fim) -> " + tempoFim);
        System.out.println("CARREGANDO (diferenca) -> " + tempoDiferenca);
        System.out.println("");
        System.out.println("-------------------------------------------");

        tempoInicio = System.currentTimeMillis();
        System.out.println("CARREGANDO (inicio) -> " + tempoInicio);
        lista.remove(750000);

        tempoFim = System.currentTimeMillis();
        tempoDiferenca = (tempoFim - tempoInicio) / 1000;

        System.out.println("CARREGANDO (fim) -> " + tempoFim);
        System.out.println("CARREGANDO (diferenca) -> " + tempoDiferenca);
        System.out.println("");
        System.out.println("-------------------------------------------");
    }

}
