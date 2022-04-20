package com.mycompany.projeto1;

public class Futebol {

    private String nome;
    public int vitorias, derrotas;
    
    public Futebol(String nome, int vitorias, int derrotas) {
        this.nome = nome;
        this.vitorias = vitorias;
        this.derrotas = derrotas;   
      
    }
    public void setTime(String time) {
        nome = time;
    }

    public String getTime() {
        return nome;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

  
       
    }

