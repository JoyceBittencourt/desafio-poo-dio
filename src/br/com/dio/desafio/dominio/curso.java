package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    private int cargaHoraria;

    @Override
    public double calcular xp (){
        return XP_Padrao * cargaHoraria }

    public curso() {
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
   public String toString() {
    return "Curso {" +
            "título' " + getTitulo() +'\'' +;
         ",descricao=' " + getDescricao() +'\'' +;
         ",cargaHoraria" + cargaHoraria+
}
