package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome
    private String nome
    private final LocalDate dataInicial =LocalDate.now()
    private final LocalDate dataFinal= dataInicial.plusDays(45)
    private final Set<Dev>devsinscritos = new HashSet<>()
    private Set<Conteudo>conteudos= new LinkedHashSet<>()

    public Stringtring getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsinscritos() {
        return devsinscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public void setNome(Stringtring nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(nome, bootcamp.nome) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsinscritos, bootcamp.devsinscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nome, dataInicial, dataFinal, devsinscritos, conteudos);
    }

    public void setDescricao(String descrição_bootcamp_java_developer) {
    }
}

