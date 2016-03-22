/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifavip.estruturadados.model;

/**
 *
 * @author walison
 * @param <T> 
 */
public class ListaEncadedaSimples<T>  {

    private Link<T> primeiro, ultimo; //guarda as primeiro e ultimo posições da lista
    private int total; //guarda o tamanho da lista 

    //inicia a lista vazia e com valores default
    public ListaEncadedaSimples() {
        this.primeiro = null;
        this.ultimo = null;
        this.total = 0;
    }

    
    public void adicionarNoComeco(T elemento) {
        Link<T> novoLink = new Link(elemento);
        
        //se a lista estiver vazia a ultimo posicao recebe a referencia da nova celula criada        
        if (this.estaVazia()) {
            this.ultimo = novoLink;
        }
    
        this.primeiro.setAnterior(novoLink);
        this.primeiro = novoLink;
        
        //atualiza a quantidade 
        this.total++;
    }

    
    public void adicionarNoFim(T elemento) {
        if (this.total == 0) {
            this.adicionarNoComeco(elemento);
        }

        Link<T> novoLink = new Link(elemento);
        
        this.ultimo.setProximo(novoLink);
        novoLink.setAnterior(ultimo);  
        this.ultimo = novoLink;

        this.total++; //atualiza a quantidade

    }

    
    public void adicionar(int posicao, T elemento) {
        if (this.estaVazia()) {
            
            this.adicionarNoComeco(elemento);
            
        } else if (this.total == posicao) {
            
            this.adicionarNoFim(elemento);
        
        } else {
          
            Link anterior = this.getLink(posicao - 1); //pega a celula anteior a posicao passada 
            Link proxima = anterior.getProximo();
            
            Link novoLink = new Link(anterior.getProximo(), elemento);
            anterior.setProximo(novoLink); //atualiza o ponteiro da celula anterior para a nova Link criada 
            proxima.setAnterior(novoLink);
            
            this.total++; //atualiza a quantidade
        }
    }

    
    private Link<T> getLink(int posicao) {
        Link atual = null;

        if (this.posicaoOcupada(posicao) == true) {
            atual = this.primeiro;

            for (int i = 0; i < posicao; i++) {
                atual = atual.getProximo();
            }
        } else {
            System.out.println("erro"); //configurar mensangem de erro!
        }

        return atual;
    }

    
    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.total;
    }

    
    public void imprimirLista() {
        Link atual = this.primeiro;
        while (atual != null) {
            System.out.println(atual.getElemento());
            atual = atual.getProximo();
        }
    }
    
    
    public int tamanho() {
        return this.total;
    }   
    
    
    public boolean estaVazia() {
        return (this.primeiro == null); //se a primeiro posicao estiver Null então a lista inteira esta vazia
    }
    
    
    public void removerDoComeco(){
        if (!this.posicaoOcupada(0)) {
            new IllegalStateException("erro");
        } 
        
        this.primeiro = this.primeiro.getProximo(); //atualiza a referencia
        this.total --; //decrementa do total 
         
        if (this.total == 0){ // se a lista estiver vazia a ultimo posicao guarda referencia de ninguem NULL
            this.ultimo = null;
        }
         
    }
    
    public void removerDoFim() {
        if (!posicaoOcupada(this.total - 1)) {
            System.out.println("posicao não existe"); //configurar mensagem de erro
        }

        if (this.total == 1) {
            this.removerDoComeco(); 
        } else {
            
            Link<T> penultimo = this.ultimo.getAnterior();
            penultimo.setProximo(null); //ultima posicao sempre é NULL
            this.ultimo = penultimo; //atualiza a referencia para o penultimo link
        }
    }
    
    public void remover(int posicao) {
        
        if (!this.posicaoOcupada(posicao)) {
        
            throw new IllegalArgumentException("posição inválida!");
        
        } else if (posicao == this.total - 1) {
            
            this.removerDoComeco();
            
        } else {
            
            Link<T> anterior = getLink(posicao -1);
            Link<T> atual = anterior.getProximo();
            Link<T> proximo = atual.getProximo();
            
            anterior.setProximo(proximo);
            proximo.setAnterior(anterior);
            
            this.total--;

        }
     }

    
    public void limparLista() {
        this.primeiro = null;
        this.total = 0;
    }
    
    
    
}
