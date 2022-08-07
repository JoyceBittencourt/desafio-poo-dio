package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    String título;
    String descricao
    LocalDate data;

    public Mentoria() {
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
