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
public class Celula<T> {
    
    private T elemento;
    private Celula<T> proximo;

    public Celula(T elemento, Celula<T> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }
    
    public Celula(T elemento){
        this.elemento = elemento;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public Celula<T> getProximo() {
        return proximo;
    }

    public void setProximo(Celula<T> proximo) {
        this.proximo = proximo;
    }

}
