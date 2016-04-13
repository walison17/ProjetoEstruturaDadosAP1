/*d
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
            this.listaSequencial.adicionar("testeAdd "+i);
        }
        long tempoFim = System.currentTimeMillis();
        
        return (tempoFim - tempoInicio);
    }
    
    public long testeInserirInicio(int quantidade){
        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < quantidade; i++) {
            this.listaSequencial.adicionarNoComeco("testeAdd "+i);
        }
        long tempoFim = System.currentTimeMillis();
        
        return (tempoFim - tempoInicio);
    }
    
    public long testeInserirQualquerPos(int posicao){
        long tempoInicio = System.currentTimeMillis();
        this.listaSequencial.adicionar(posicao, "teste");
        long tempoFim = System.currentTimeMillis();
        
        return (tempoFim - tempoInicio);
    }
    
    public long testeRemoveBegin(){
        long tempoInicio = System.currentTimeMillis();
        this.listaSequencial.removerDoComeco();
        long tempoFim = System.currentTimeMillis();
        
        return (tempoFim - tempoInicio);
    }
    
    public long testeRemoveEnd(){
        long tempoInicio = System.currentTimeMillis();
        this.listaSequencial.removerDoFim();
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
        this.listaSequencial.limpar();
        long tempoFim = System.currentTimeMillis();
        
        return (tempoFim - tempoInicio);
    }
    
    public long testePega(int posicao){
       long tempoInicio = System.currentTimeMillis();
       this.listaSequencial.pegar(posicao);
       long tempoFim = System.currentTimeMillis();
       
       return (tempoFim - tempoInicio);
    }
    
    
}
