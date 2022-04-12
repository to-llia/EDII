package com.arvore;

public class No {
    private int elemento;
    private No pai;
    private No esquerda;
    private No direita;

    public No(int elemento) {
        this.elemento = elemento;
        this.pai = null;
        this.esquerda = null;
        this.direita = null;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public No getPai() {
        return pai;
    }

    public void setPai(No pai) {
        this.pai = pai;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }
}
