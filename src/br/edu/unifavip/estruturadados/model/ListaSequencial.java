/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifavip.estruturadados.model;

import java.util.Arrays;

/**
 *
 * @author fabio
 * @param <T> Adiciona Generics na lista Sequencial
 */
public class ListaSequencial<T> {

    //Variável que determina tamanho do vetor
    public int tamanho;

    //Variável que determina tamanho que o vetor vai aumentar
    public int aumentaTamanho;

    //Variáveis Privadas
    //Array Com Generics
    private T[] alunos = (T[]) new Object[tamanho];
    private  int quantAlunos = 0;
   
    
    public void adiciona(T elemento) {
        this.garantaEspaco();
        this.alunos[this.quantAlunos] = elemento;
        quantAlunos++;
    }

    
    public void adicionaQualquerPos(int posicao, T elemento) {

        if (!this.posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        this.garantaEspaco();
        for (int i = this.quantAlunos - 1; i >= posicao; i--) {
            this.alunos[i + 1] = this.alunos[i];
        }
        this.alunos[posicao] = elemento;
        this.quantAlunos++;
    }

    
    public void remove(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < this.quantAlunos - 1; i++) {
            this.alunos[i] = this.alunos[i + 1];
        }
        this.quantAlunos--;
    }

    
    public T retornaAluno(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.alunos[posicao];
    }

    
    public T contemAluno(T elemento) {
        T aux = null;
        for (int i = 0; i < this.quantAlunos; i++) {
            if (elemento.equals(this.alunos[i])) {
                aux = this.alunos[i];
            }
        }
        return aux;
    }

   public void removeTodos(){
       
       for (int i = 0; i < this.alunos.length; i++) {
           this.alunos[i] = null;
           quantAlunos--;
       }
       
   }
    
    public int tamanhoLista() {
        return this.quantAlunos;
    }

    //Métodos Privados da lista
    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.quantAlunos;
    }

    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao <= this.alunos.length;
    }

    private void garantaEspaco() {

        if (this.quantAlunos == this.alunos.length) {
            T[] novoArray = Arrays.copyOf(alunos, this.alunos.length + aumentaTamanho);
            this.alunos = novoArray;
        }
    }
    
    @Override
    public String toString() {
        if (this.quantAlunos == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < this.quantAlunos - 1; i++) {
            builder.append(this.alunos[i]);
            builder.append(", ");
        }
        builder.append(this.alunos[this.quantAlunos - 1]);
        builder.append("]");
        return builder.toString();
    }

}
