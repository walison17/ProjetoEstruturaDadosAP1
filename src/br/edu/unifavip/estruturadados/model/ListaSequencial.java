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
public class ListaSequencial implements IMetodosLista {

    //Variável que determina tamanho do vetor
    public int tamanho;

    //Variável que determina tamanho que o vetor vai aumentar
    public int aumentaTamanho;

    private Aluno[] alunos = new Aluno[tamanho];
    private int quantAlunos = 0;

    @Override
    public void povoaLista(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            Aluno aluno = new Aluno("Aluno " + i);
            this.adiciona(aluno);
        }
    }

    @Override
    public void adiciona(Aluno aluno) {
        this.garantaEspaco();
        this.alunos[this.quantAlunos] = aluno;
        quantAlunos++;
    }

    @Override
    public void adicionaQualquerPosicao(int posicao, Aluno aluno) {
        this.garantaEspaco();
        if (!this.posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = this.quantAlunos - 1; i >= posicao; i--) {
            this.alunos[i + 1] = this.alunos[i];
        }
        this.alunos[posicao] = aluno;
        this.quantAlunos++;
    }

    @Override
    public void remove(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < this.quantAlunos - 1; i++) {
            this.alunos[i] = this.alunos[i + 1];
        }
        this.quantAlunos--;
    }

    @Override
    public Aluno retornaAluno(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.alunos[posicao];
    }

    @Override
    public boolean contemAluno(Aluno aluno) {
        for (int i = 0; i < this.quantAlunos; i++) {
            if (aluno.equals(this.alunos[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int tamanhoLista() {
        return this.quantAlunos;
    }

    //Métodos Privados da lista
    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.quantAlunos;
    }

    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao <= this.quantAlunos;
    }

    private void garantaEspaco() {
        if (this.quantAlunos == this.alunos.length) {
            Aluno[] novaArray = new Aluno[this.alunos.length + aumentaTamanho];
            System.arraycopy(this.alunos, 0, novaArray, 0, this.alunos.length);
            this.alunos = novaArray;
        }
    }

}
