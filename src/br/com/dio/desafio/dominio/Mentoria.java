package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends conteudo {

    private static final Object XP_PADRAO = ;
    LocalDate data;


    @Override
    public double calcularXP() {
        return.XP_PADRAO+20d;
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public string toString ()
        return "Mentoria{" +
                "Título = " + getTitulo() +'\'' +
                ",descricao=' " + getDescricao()
    ",data
}
}
