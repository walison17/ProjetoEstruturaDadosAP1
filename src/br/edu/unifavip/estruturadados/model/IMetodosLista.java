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
public interface IMetodosLista {
    
    public void adiciona(Aluno aluno);
    
    public void adicionaQualquerPosicao(int posicao,Aluno aluno);
    
    public void remove(int posicao);
    
    public Aluno retornaAluno(int posicao);
    
    public int tamanhoLista();
    
    public void povoaLista(int quantidade);
    
    public boolean contemAluno(Aluno aluno);
    
}
