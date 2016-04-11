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
public class TesteListaSequencial {
    
    private ListaSequencial<String> listaSequencial = new ListaSequencial();
    
    public long testeInserirFim(int quantidade){
        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < quantidade; i++) {
            this.listaSequencial.adiciona("testeAdd "+i);
        }
        long tempoFim = System.currentTimeMillis();
        
        return (tempoFim - tempoInicio);
    }
    
    public long testeInserirInicio(int quantidade){
        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < quantidade; i++) {
            this.listaSequencial.adicionaQualquerPos(0,"testeAdd "+i);
        }
        long tempoFim = System.currentTimeMillis();
        
        return (tempoFim - tempoInicio);
    }
    
    public long testeInserirQualquerPos(int posicao){
        long tempoInicio = System.currentTimeMillis();
        this.listaSequencial.adicionaQualquerPos(posicao, "teste");
        long tempoFim = System.currentTimeMillis();
        
        return (tempoFim - tempoInicio);
    }
    
    public long testeRemoveBegin(){
        long tempoInicio = System.currentTimeMillis();
        this.listaSequencial.remove(0);
        long tempoFim = System.currentTimeMillis();
        
        return (tempoFim - tempoInicio);
    }
    
    public long testeRemoveEnd(){
        long tempoInicio = System.currentTimeMillis();
        this.listaSequencial.remove(this.listaSequencial.tamanhoLista() - 1);
        long tempoFim = System.currentTimeMillis();
        
        return (tempoFim - tempoInicio);
    }
    
    
    public long testeRemovePos(int posicao){
        long tempoInicio = System.currentTimeMillis();
        this.listaSequencial.remove(posicao);
        long tempoFim = System.currentTimeMillis();
        
        return (tempoFim - tempoInicio);
    }
    
    
    public long testeRemoveEveryThing(){
        long tempoInicio = System.currentTimeMillis();
        this.listaSequencial.removeTodos();
        long tempoFim = System.currentTimeMillis();
        
        return (tempoFim - tempoInicio);
    }
    
    public long testePega(int posicao){
       long tempoInicio = System.currentTimeMillis();
       this.listaSequencial.retornaAluno(posicao);
       long tempoFim = System.currentTimeMillis();
       
       return (tempoFim - tempoInicio);
    }
    
    
}
