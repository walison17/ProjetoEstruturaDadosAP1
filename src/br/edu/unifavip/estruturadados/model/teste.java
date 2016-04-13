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
public class teste {
    
    public static void main (String [] args ){
        
        Pessoa p = new Pessoa("walison", 22);
        Pessoa p1 = new Pessoa("walison2", 22);
        
        
        ListaEncadedaSimples<Pessoa> lista = new ListaEncadedaSimples<>();
        lista.adicionarNoComeco(p);
        lista.adicionarNoComeco(p1);
        lista.adicionarNoFim(p1);
        
        lista.imprimirLista();
        
        ListaSequencial<Aluno> listaS = new ListaSequencial();
        listaS.tamanho = 100000;
        listaS.aumentaTamanho = 300;
        
        Aluno fodase = new Aluno("Fábio");
        listaS.adicionar(1000,fodase);
        System.out.println(listaS.pegar(1000));
        
        listaS.remove(1000);
        System.out.println(listaS.pegar(1000));
    } 
    
}
