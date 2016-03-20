/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifavip.estruturadados.model;

/**
 *
 * @author walison
 */
public class ListaEncadedaSimples<T> {

    private Celula<T> primeira, ultima; //guarda as primeira e ultima posições da lista
    private int total; //guarda o tamanho da lista 

    //inicia a lista vazia e com valores default
    public ListaEncadedaSimples() {
        this.primeira = null;
        this.ultima = null;
        this.total = 0;
    }

    public void adicionarNoComeco(T elemento) {
        Celula<T> novaCelula = new Celula(elemento);
        novaCelula.setProximo(primeira);

        //se a lista estiver vazia a ultima posicao recebe a referencia da nova celula criada
        if (this.total == 0) {
            this.ultima = novaCelula;
        }
        this.primeira = novaCelula;

        //atualiza a quantidade 
        this.total++;
    }

    public void adicionarNoFim(T elemento) {
        if (this.total == 0) {
            this.adicionarNoComeco(elemento);
        }

        Celula<T> novaCelula = new Celula(elemento);
        this.ultima.setProximo(novaCelula); //aponta para a nova celula
        this.ultima = novaCelula; //atualiza a referencia da ultima posicao

        this.total++;

    }

    public void adicionar(int posicao, T elemento) {
        if (this.total == 0) {
            this.adicionarNoComeco(elemento);
        } else if (posicao == this.total) {;
            this.adicionarNoFim(elemento);
        } else {
            Celula anterior = this.getCelula(posicao - 1); //pega a celula anteior a posicao passada 
            Celula novaCelula = new Celula(anterior.getProximo(), elemento);
            anterior.setProximo(novaCelula); //atualiza o ponteiro da celula anterior para a nova Celula criada 

            this.total++;
        }
    }

    private Celula<T> getCelula(int posicao) {
        Celula atual = null;

        if (this.posicaoOcupada(posicao) == true) {
            atual = this.primeira;

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
        Celula atual = this.primeira;
        while (atual != null) {
            System.out.println(atual.getElemento());
            atual = atual.getProximo();
        }
    }
}
