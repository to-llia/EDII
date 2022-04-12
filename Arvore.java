package com.arvore;

public class Arvore {
    protected No raiz;
    protected int size;

    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public No InserirRaiz(No e) throws Exception{
        if(this.raiz == null){
            this.raiz = new No(e.getElemento());
            size ++;
            return raiz;
        }
     else{
         throw new Exception("Já possui raiz");
        }
    }

    public void InserirEsquerda(No v, No e) throws Exception {
        No v1 = (No)v;

        if(temEsquerda(v)){
            throw new Exception("Já possui esquerda");
        } else{
        int pos = v1.getPai().getElemento()*2+1;}
        size++;
    }

    public boolean temEsquerda(No e){
        if(e.getEsquerda() == null){
            return true;
        } else
            return false;
    }

}
