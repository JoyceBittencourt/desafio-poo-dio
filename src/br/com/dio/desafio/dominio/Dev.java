package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;

public class Dev {

    private String nome;
    private Set < conteudo>conteudosInscritos; = new LinkedHashSet<>();
    private Set <conteudo> conteudosConcluidos; new LinkedHashSet<>();

    public void inscreverbootcamp (Bootcamp bootcamp){}
    this.conteudosInscritos.addAll(Bootcamp.getConteudos());
    Bootcamp.getDevsInscritos().add.(this);

    public void progredir(){}
    Optional<Conteudo>conteudo=this.conteudosInscritos.stream().findFirst();
  if (conteudo.isPresent(){
      this.conteudosInscritos.add(conteudo.get())
    this.conteudosInscritos.remove(conteudo.get())
    } else {
  System.err.println("Você não está matriculado em nenhum conteúdo!");

    public void calcularTotalXP(){}
      return this.conteudosConcluidos
              .stream
              .mapToDouble(conteudo->conteudo.calcularXp())
              .sum();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}

    public String getCont
    eudosInscritos() {
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
    }

    public void setNome(String joyce) {
    }
