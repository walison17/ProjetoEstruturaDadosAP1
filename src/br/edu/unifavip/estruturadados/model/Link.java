/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifavip.estruturadados.model;

/**
 *
 * @author walison
 * @param <T> representa o tipo que será guardado no link
 */
public class Link<T> {
    
    private T elemento;
    private Link<T> proximo;
    private Link<T> anterior;

    public Link(Link<T> proximo, T elemento) {
        this.elemento = elemento;
        this.proximo = proximo;
        
    }
    
    public Link(T elemento){
        this.elemento = elemento;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public Link<T> getProximo() {
        return proximo;
    }

    public void setProximo(Link<T> proximo) {
        this.proximo = proximo;
    }

    public Link<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(Link<T> anterior) {
        this.anterior = anterior;
    }
    
    
    
}
